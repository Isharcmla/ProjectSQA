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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ComplexFormat_getRealFormat_1879366517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2417;

    public ComplexFormat_getRealFormat_1879366517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2639 = Class.forName((String) "java.math.RoundingMode");
        Field term2638 = ((Class) term2639).getDeclaredField((String) "HALF_EVEN");
        ((Field) term2638).setAccessible(true);
        Object enum5 = ((Field) term2638).get((Object) null);
        term2417 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term2421 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term2422 = newInstance(Class.forName("java.text.DigitList"));
        char[] term2425 = (char[]) newCharArray(19);
        Object term2474 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term2497 = newInstance(Class.forName("java.util.Locale"));
        Object term2498 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2524 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term2525 = newInstance(Class.forName("java.text.DigitList"));
        char[] term2528 = (char[]) newCharArray(19);
        Object term2573 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term2417, term2417.getClass(), "imaginaryCharacter", "i");
        setField(term2421, term2421.getClass(), "bigIntegerMultiplier", null);
        setField(term2421, term2421.getClass(), "bigDecimalMultiplier", null);
        setIntField(term2422, term2422.getClass(), "decimalAt", 0);
        setIntField(term2422, term2422.getClass(), "count", 0);
        setField(term2422, term2422.getClass(), "digits", term2425);
        setField(term2422, term2422.getClass(), "data", null);
        setField(term2422, term2422.getClass(), "roundingMode", enum5);
        setBooleanField(term2422, term2422.getClass(), "isNegative", false);
        setField(term2422, term2422.getClass(), "tempBuffer", null);
        setField(term2421, term2421.getClass(), "digitList", term2422);
        setField(term2421, term2421.getClass(), "positivePrefix", "");
        setField(term2421, term2421.getClass(), "positiveSuffix", "");
        setField(term2421, term2421.getClass(), "negativePrefix", "-");
        setField(term2421, term2421.getClass(), "negativeSuffix", "");
        setField(term2421, term2421.getClass(), "posPrefixPattern", "");
        setField(term2421, term2421.getClass(), "posSuffixPattern", "");
        setField(term2421, term2421.getClass(), "negPrefixPattern", "\'-");
        setField(term2421, term2421.getClass(), "negSuffixPattern", "");
        setIntField(term2421, term2421.getClass(), "multiplier", 1);
        setByteField(term2421, term2421.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term2421, term2421.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term2421, term2421.getClass(), "parseBigDecimal", false);
        setBooleanField(term2421, term2421.getClass(), "isCurrencyFormat", false);
        setCharField(term2474, term2474.getClass(), "zeroDigit", (char) 48);
        setCharField(term2474, term2474.getClass(), "groupingSeparator", (char) 44);
        setCharField(term2474, term2474.getClass(), "decimalSeparator", (char) 46);
        setCharField(term2474, term2474.getClass(), "perMill", (char) 8240);
        setCharField(term2474, term2474.getClass(), "percent", (char) 37);
        setCharField(term2474, term2474.getClass(), "digit", (char) 35);
        setCharField(term2474, term2474.getClass(), "patternSeparator", (char) 59);
        setField(term2474, term2474.getClass(), "infinity", "\u001E\"");
        setField(term2474, term2474.getClass(), "NaN", "NaN");
        setCharField(term2474, term2474.getClass(), "minusSign", (char) 45);
        setField(term2474, term2474.getClass(), "currencySymbol", null);
        setField(term2474, term2474.getClass(), "intlCurrencySymbol", null);
        setCharField(term2474, term2474.getClass(), "monetarySeparator", (char) 46);
        setCharField(term2474, term2474.getClass(), "exponential", 'E');
        setField(term2474, term2474.getClass(), "exponentialSeparator", "E");
        setField(term2498, term2498.getClass(), "language", null);
        setField(term2498, term2498.getClass(), "script", null);
        setField(term2498, term2498.getClass(), "region", null);
        setField(term2498, term2498.getClass(), "variant", null);
        setIntField(term2498, term2498.getClass(), "hash", 96636889);
        setField(term2497, term2497.getClass(), "baseLocale", term2498);
        setField(term2497, term2497.getClass(), "localeExtensions", null);
        setIntField(term2497, term2497.getClass(), "hashCodeValue", 96636889);
        setField(term2497, term2497.getClass(), "languageTag", "");
        setField(term2474, term2474.getClass(), "locale", term2497);
        setField(term2474, term2474.getClass(), "currency", null);
        setBooleanField(term2474, term2474.getClass(), "currencyInitialized", false);
        setIntField(term2474, term2474.getClass(), "serialVersionOnStream", 3);
        setField(term2421, term2421.getClass(), "symbols", term2474);
        setBooleanField(term2421, term2421.getClass(), "useExponentialNotation", false);
        setField(term2421, term2421.getClass(), "positivePrefixFieldPositions", null);
        setField(term2421, term2421.getClass(), "positiveSuffixFieldPositions", null);
        setField(term2421, term2421.getClass(), "negativePrefixFieldPositions", null);
        setField(term2421, term2421.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term2421, term2421.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term2421, term2421.getClass(), "maximumIntegerDigits", 309);
        setIntField(term2421, term2421.getClass(), "minimumIntegerDigits", 1);
        setIntField(term2421, term2421.getClass(), "maximumFractionDigits", 2);
        setIntField(term2421, term2421.getClass(), "minimumFractionDigits", 0);
        setField(term2421, term2421.getClass(), "roundingMode", enum5);
        setBooleanField(term2421, term2421.getClass(), "isFastPath", false);
        setBooleanField(term2421, term2421.getClass(), "fastPathCheckNeeded", true);
        setField(term2421, term2421.getClass(), "fastPathData", null);
        setIntField(term2421, term2421.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term2421, term2421.getClass(), "groupingUsed", true);
        setByteField(term2421, term2421.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term2421, term2421.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term2421, term2421.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term2421, term2421.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term2421, term2421.getClass(), "parseIntegerOnly", false);
        setField(term2417, term2417.getClass(), "imaginaryFormat", term2421);
        setField(term2524, term2524.getClass(), "bigIntegerMultiplier", null);
        setField(term2524, term2524.getClass(), "bigDecimalMultiplier", null);
        setIntField(term2525, term2525.getClass(), "decimalAt", 0);
        setIntField(term2525, term2525.getClass(), "count", 0);
        setField(term2525, term2525.getClass(), "digits", term2528);
        setField(term2525, term2525.getClass(), "data", null);
        setField(term2525, term2525.getClass(), "roundingMode", enum5);
        setBooleanField(term2525, term2525.getClass(), "isNegative", false);
        setField(term2525, term2525.getClass(), "tempBuffer", null);
        setField(term2524, term2524.getClass(), "digitList", term2525);
        setField(term2524, term2524.getClass(), "positivePrefix", "");
        setField(term2524, term2524.getClass(), "positiveSuffix", "");
        setField(term2524, term2524.getClass(), "negativePrefix", "-");
        setField(term2524, term2524.getClass(), "negativeSuffix", "");
        setField(term2524, term2524.getClass(), "posPrefixPattern", "");
        setField(term2524, term2524.getClass(), "posSuffixPattern", "");
        setField(term2524, term2524.getClass(), "negPrefixPattern", "\'-");
        setField(term2524, term2524.getClass(), "negSuffixPattern", "");
        setIntField(term2524, term2524.getClass(), "multiplier", 1);
        setByteField(term2524, term2524.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term2524, term2524.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term2524, term2524.getClass(), "parseBigDecimal", false);
        setBooleanField(term2524, term2524.getClass(), "isCurrencyFormat", false);
        setCharField(term2573, term2573.getClass(), "zeroDigit", (char) 48);
        setCharField(term2573, term2573.getClass(), "groupingSeparator", (char) 44);
        setCharField(term2573, term2573.getClass(), "decimalSeparator", (char) 46);
        setCharField(term2573, term2573.getClass(), "perMill", (char) 8240);
        setCharField(term2573, term2573.getClass(), "percent", (char) 37);
        setCharField(term2573, term2573.getClass(), "digit", (char) 35);
        setCharField(term2573, term2573.getClass(), "patternSeparator", (char) 59);
        setField(term2573, term2573.getClass(), "infinity", "\u001E\"");
        setField(term2573, term2573.getClass(), "NaN", "NaN");
        setCharField(term2573, term2573.getClass(), "minusSign", (char) 45);
        setField(term2573, term2573.getClass(), "currencySymbol", null);
        setField(term2573, term2573.getClass(), "intlCurrencySymbol", null);
        setCharField(term2573, term2573.getClass(), "monetarySeparator", (char) 46);
        setCharField(term2573, term2573.getClass(), "exponential", 'E');
        setField(term2573, term2573.getClass(), "exponentialSeparator", "E");
        setField(term2573, term2573.getClass(), "locale", term2497);
        setField(term2573, term2573.getClass(), "currency", null);
        setBooleanField(term2573, term2573.getClass(), "currencyInitialized", false);
        setIntField(term2573, term2573.getClass(), "serialVersionOnStream", 3);
        setField(term2524, term2524.getClass(), "symbols", term2573);
        setBooleanField(term2524, term2524.getClass(), "useExponentialNotation", false);
        setField(term2524, term2524.getClass(), "positivePrefixFieldPositions", null);
        setField(term2524, term2524.getClass(), "positiveSuffixFieldPositions", null);
        setField(term2524, term2524.getClass(), "negativePrefixFieldPositions", null);
        setField(term2524, term2524.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term2524, term2524.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term2524, term2524.getClass(), "maximumIntegerDigits", 309);
        setIntField(term2524, term2524.getClass(), "minimumIntegerDigits", 1);
        setIntField(term2524, term2524.getClass(), "maximumFractionDigits", 2);
        setIntField(term2524, term2524.getClass(), "minimumFractionDigits", 0);
        setField(term2524, term2524.getClass(), "roundingMode", enum5);
        setBooleanField(term2524, term2524.getClass(), "isFastPath", false);
        setBooleanField(term2524, term2524.getClass(), "fastPathCheckNeeded", true);
        setField(term2524, term2524.getClass(), "fastPathData", null);
        setIntField(term2524, term2524.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term2524, term2524.getClass(), "groupingUsed", true);
        setByteField(term2524, term2524.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term2524, term2524.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term2524, term2524.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term2524, term2524.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term2524, term2524.getClass(), "parseIntegerOnly", false);
        setField(term2417, term2417.getClass(), "realFormat", term2524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealFormat", argTypes, term2417, args);
    }

};


