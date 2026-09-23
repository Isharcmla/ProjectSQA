package org.apache.commons.math.complex;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ComplexFormat_format_138495703935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70;
     Object term271;
     Object term274;
     Object term306;

    public ComplexFormat_format_138495703935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12699 = Class.forName((String) "java.math.RoundingMode");
        Field term12698 = ((Class) term12699).getDeclaredField((String) "HALF_DOWN");
        ((Field) term12698).setAccessible(true);
        Object enum19 = ((Field) term12698).get((Object) null);
        term70 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term74 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term75 = newInstance(Class.forName("java.text.DigitList"));
        char[] term78 = (char[]) newCharArray(19);
        Object term127 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term150 = newInstance(Class.forName("java.util.Locale"));
        Object term151 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term177 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term178 = newInstance(Class.forName("java.text.DigitList"));
        char[] term181 = (char[]) newCharArray(19);
        Object term226 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term70, term70.getClass(), "imaginaryCharacter", "i");
        setField(term74, term74.getClass(), "bigIntegerMultiplier", null);
        setField(term74, term74.getClass(), "bigDecimalMultiplier", null);
        setIntField(term75, term75.getClass(), "decimalAt", 0);
        setIntField(term75, term75.getClass(), "count", 0);
        setField(term75, term75.getClass(), "digits", term78);
        setField(term75, term75.getClass(), "data", null);
        setField(term75, term75.getClass(), "roundingMode", enum19);
        setBooleanField(term75, term75.getClass(), "isNegative", false);
        setField(term75, term75.getClass(), "tempBuffer", null);
        setField(term74, term74.getClass(), "digitList", term75);
        setField(term74, term74.getClass(), "positivePrefix", "");
        setField(term74, term74.getClass(), "positiveSuffix", "");
        setField(term74, term74.getClass(), "negativePrefix", "-");
        setField(term74, term74.getClass(), "negativeSuffix", "");
        setField(term74, term74.getClass(), "posPrefixPattern", "");
        setField(term74, term74.getClass(), "posSuffixPattern", "");
        setField(term74, term74.getClass(), "negPrefixPattern", "\'-");
        setField(term74, term74.getClass(), "negSuffixPattern", "");
        setIntField(term74, term74.getClass(), "multiplier", 1);
        setByteField(term74, term74.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term74, term74.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term74, term74.getClass(), "parseBigDecimal", false);
        setBooleanField(term74, term74.getClass(), "isCurrencyFormat", false);
        setCharField(term127, term127.getClass(), "zeroDigit", (char) 48);
        setCharField(term127, term127.getClass(), "groupingSeparator", (char) 44);
        setCharField(term127, term127.getClass(), "decimalSeparator", (char) 46);
        setCharField(term127, term127.getClass(), "perMill", (char) 8240);
        setCharField(term127, term127.getClass(), "percent", (char) 37);
        setCharField(term127, term127.getClass(), "digit", (char) 35);
        setCharField(term127, term127.getClass(), "patternSeparator", (char) 59);
        setField(term127, term127.getClass(), "infinity", "\u001E\"");
        setField(term127, term127.getClass(), "NaN", "NaN");
        setCharField(term127, term127.getClass(), "minusSign", (char) 45);
        setField(term127, term127.getClass(), "currencySymbol", null);
        setField(term127, term127.getClass(), "intlCurrencySymbol", null);
        setCharField(term127, term127.getClass(), "monetarySeparator", (char) 46);
        setCharField(term127, term127.getClass(), "exponential", 'E');
        setField(term127, term127.getClass(), "exponentialSeparator", "E");
        setField(term151, term151.getClass(), "language", null);
        setField(term151, term151.getClass(), "script", null);
        setField(term151, term151.getClass(), "region", null);
        setField(term151, term151.getClass(), "variant", null);
        setIntField(term151, term151.getClass(), "hash", 96636889);
        setField(term150, term150.getClass(), "baseLocale", term151);
        setField(term150, term150.getClass(), "localeExtensions", null);
        setIntField(term150, term150.getClass(), "hashCodeValue", 96636889);
        setField(term150, term150.getClass(), "languageTag", "");
        setField(term127, term127.getClass(), "locale", term150);
        setField(term127, term127.getClass(), "currency", null);
        setBooleanField(term127, term127.getClass(), "currencyInitialized", false);
        setIntField(term127, term127.getClass(), "serialVersionOnStream", 3);
        setField(term74, term74.getClass(), "symbols", term127);
        setBooleanField(term74, term74.getClass(), "useExponentialNotation", false);
        setField(term74, term74.getClass(), "positivePrefixFieldPositions", null);
        setField(term74, term74.getClass(), "positiveSuffixFieldPositions", null);
        setField(term74, term74.getClass(), "negativePrefixFieldPositions", null);
        setField(term74, term74.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term74, term74.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term74, term74.getClass(), "maximumIntegerDigits", 309);
        setIntField(term74, term74.getClass(), "minimumIntegerDigits", 1);
        setIntField(term74, term74.getClass(), "maximumFractionDigits", 2);
        setIntField(term74, term74.getClass(), "minimumFractionDigits", 0);
        setField(term74, term74.getClass(), "roundingMode", enum19);
        setBooleanField(term74, term74.getClass(), "isFastPath", false);
        setBooleanField(term74, term74.getClass(), "fastPathCheckNeeded", true);
        setField(term74, term74.getClass(), "fastPathData", null);
        setIntField(term74, term74.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term74, term74.getClass(), "groupingUsed", true);
        setByteField(term74, term74.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term74, term74.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term74, term74.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term74, term74.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term74, term74.getClass(), "parseIntegerOnly", false);
        setField(term70, term70.getClass(), "imaginaryFormat", term74);
        setField(term177, term177.getClass(), "bigIntegerMultiplier", null);
        setField(term177, term177.getClass(), "bigDecimalMultiplier", null);
        setIntField(term178, term178.getClass(), "decimalAt", 0);
        setIntField(term178, term178.getClass(), "count", 0);
        setField(term178, term178.getClass(), "digits", term181);
        setField(term178, term178.getClass(), "data", null);
        setField(term178, term178.getClass(), "roundingMode", enum19);
        setBooleanField(term178, term178.getClass(), "isNegative", false);
        setField(term178, term178.getClass(), "tempBuffer", null);
        setField(term177, term177.getClass(), "digitList", term178);
        setField(term177, term177.getClass(), "positivePrefix", "");
        setField(term177, term177.getClass(), "positiveSuffix", "");
        setField(term177, term177.getClass(), "negativePrefix", "-");
        setField(term177, term177.getClass(), "negativeSuffix", "");
        setField(term177, term177.getClass(), "posPrefixPattern", "");
        setField(term177, term177.getClass(), "posSuffixPattern", "");
        setField(term177, term177.getClass(), "negPrefixPattern", "\'-");
        setField(term177, term177.getClass(), "negSuffixPattern", "");
        setIntField(term177, term177.getClass(), "multiplier", 1);
        setByteField(term177, term177.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term177, term177.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term177, term177.getClass(), "parseBigDecimal", false);
        setBooleanField(term177, term177.getClass(), "isCurrencyFormat", false);
        setCharField(term226, term226.getClass(), "zeroDigit", (char) 48);
        setCharField(term226, term226.getClass(), "groupingSeparator", (char) 44);
        setCharField(term226, term226.getClass(), "decimalSeparator", (char) 46);
        setCharField(term226, term226.getClass(), "perMill", (char) 8240);
        setCharField(term226, term226.getClass(), "percent", (char) 37);
        setCharField(term226, term226.getClass(), "digit", (char) 35);
        setCharField(term226, term226.getClass(), "patternSeparator", (char) 59);
        setField(term226, term226.getClass(), "infinity", "\u001E\"");
        setField(term226, term226.getClass(), "NaN", "NaN");
        setCharField(term226, term226.getClass(), "minusSign", (char) 45);
        setField(term226, term226.getClass(), "currencySymbol", null);
        setField(term226, term226.getClass(), "intlCurrencySymbol", null);
        setCharField(term226, term226.getClass(), "monetarySeparator", (char) 46);
        setCharField(term226, term226.getClass(), "exponential", 'E');
        setField(term226, term226.getClass(), "exponentialSeparator", "E");
        setField(term226, term226.getClass(), "locale", term150);
        setField(term226, term226.getClass(), "currency", null);
        setBooleanField(term226, term226.getClass(), "currencyInitialized", false);
        setIntField(term226, term226.getClass(), "serialVersionOnStream", 3);
        setField(term177, term177.getClass(), "symbols", term226);
        setBooleanField(term177, term177.getClass(), "useExponentialNotation", false);
        setField(term177, term177.getClass(), "positivePrefixFieldPositions", null);
        setField(term177, term177.getClass(), "positiveSuffixFieldPositions", null);
        setField(term177, term177.getClass(), "negativePrefixFieldPositions", null);
        setField(term177, term177.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term177, term177.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term177, term177.getClass(), "maximumIntegerDigits", 309);
        setIntField(term177, term177.getClass(), "minimumIntegerDigits", 1);
        setIntField(term177, term177.getClass(), "maximumFractionDigits", 2);
        setIntField(term177, term177.getClass(), "minimumFractionDigits", 0);
        setField(term177, term177.getClass(), "roundingMode", enum19);
        setBooleanField(term177, term177.getClass(), "isFastPath", false);
        setBooleanField(term177, term177.getClass(), "fastPathCheckNeeded", true);
        setField(term177, term177.getClass(), "fastPathData", null);
        setIntField(term177, term177.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term177, term177.getClass(), "groupingUsed", true);
        setByteField(term177, term177.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term177, term177.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term177, term177.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term177, term177.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term177, term177.getClass(), "parseIntegerOnly", false);
        setField(term70, term70.getClass(), "realFormat", term177);
        term271 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term271, term271.getClass(), "imaginary", 0.5523635872663106);
        setDoubleField(term271, term271.getClass(), "real", 0.544608645520025);
        term274 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term287 = (byte[]) newByteArray(16);
        setField(term274, term274.getClass(), "toStringCache", "xxtlPwDYFs");
        setField(term274, term274.getClass(), "value", term287);
        setByteField(term274, term274.getClass(), "coder", (byte) 47);
        setIntField(term274, term274.getClass(), "count", 568599855);
        term306 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term310 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term306, term306.getClass(), "field", 1162663216);
        setIntField(term306, term306.getClass(), "endIndex", 1484323161);
        setIntField(term306, term306.getClass(), "beginIndex", 391863371);
        setField(term310, term310.getClass(), "name", "jJCZpVmanW");
        setField(term306, term306.getClass(), "attribute", term310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term271;
        args[1] = term274;
        args[2] = term306;
        try {
            callMethod(klass, "format", argTypes, term70, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


