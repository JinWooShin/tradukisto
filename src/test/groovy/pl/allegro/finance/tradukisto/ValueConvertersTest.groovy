package pl.allegro.finance.tradukisto

import com.google.common.base.VerifyException
import spock.lang.Specification

import static pl.allegro.finance.tradukisto.ValueConverters.CZECH_INTEGER
import static pl.allegro.finance.tradukisto.ValueConverters.POLISH_INTEGER

class ValueConvertersTest extends Specification {

    def "should convert numbers in Polish"() {
        expect:
        POLISH_INTEGER.asWords(1_234) == "jeden tysiąc dwieście trzydzieści cztery"
    }

    def "should convert numbers in Czech"() {
        expect:
        CZECH_INTEGER.asWords(1_234) == "jeden tisíc dvě stě třicet čtyři"
    }

    def "should throw exception when null given"() {
        when:
        POLISH_INTEGER.asWords(null)

        then:
        thrown(VerifyException)
    }
}