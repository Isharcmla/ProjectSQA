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

public class ComplexFormat_parse_164025440818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2819;

    public ComplexFormat_parse_164025440818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3053 = Class.forName((String) "java.math.RoundingMode");
        Field term3052 = ((Class) term3053).getDeclaredField((String) "HALF_UP");
        ((Field) term3052).setAccessible(true);
        Object enum6 = ((Field) term3052).get((Object) null);
        term2819 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term2823 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term2824 = newInstance(Class.forName("java.text.DigitList"));
        char[] term2827 = (char[]) newCharArray(19);
        Object term2876 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term2899 = newInstance(Class.forName("java.util.Locale"));
        Object term2900 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term2926 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term2927 = newInstance(Class.forName("java.text.DigitList"));
        char[] term2930 = (char[]) newCharArray(19);
        Object term2975 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term2819, term2819.getClass(), "imaginaryCharacter", "i");
        setField(term2823, term2823.getClass(), "bigIntegerMultiplier", null);
        setField(term2823, term2823.getClass(), "bigDecimalMultiplier", null);
        setIntField(term2824, term2824.getClass(), "decimalAt", 0);
        setIntField(term2824, term2824.getClass(), "count", 0);
        setField(term2824, term2824.getClass(), "digits", term2827);
        setField(term2824, term2824.getClass(), "data", null);
        setField(term2824, term2824.getClass(), "roundingMode", enum6);
        setBooleanField(term2824, term2824.getClass(), "isNegative", false);
        setField(term2824, term2824.getClass(), "tempBuffer", null);
        setField(term2823, term2823.getClass(), "digitList", term2824);
        setField(term2823, term2823.getClass(), "positivePrefix", "");
        setField(term2823, term2823.getClass(), "positiveSuffix", "");
        setField(term2823, term2823.getClass(), "negativePrefix", "-");
        setField(term2823, term2823.getClass(), "negativeSuffix", "");
        setField(term2823, term2823.getClass(), "posPrefixPattern", "");
        setField(term2823, term2823.getClass(), "posSuffixPattern", "");
        setField(term2823, term2823.getClass(), "negPrefixPattern", "\'-");
        setField(term2823, term2823.getClass(), "negSuffixPattern", "");
        setIntField(term2823, term2823.getClass(), "multiplier", 1);
        setByteField(term2823, term2823.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term2823, term2823.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term2823, term2823.getClass(), "parseBigDecimal", false);
        setBooleanField(term2823, term2823.getClass(), "isCurrencyFormat", false);
        setCharField(term2876, term2876.getClass(), "zeroDigit", (char) 48);
        setCharField(term2876, term2876.getClass(), "groupingSeparator", (char) 44);
        setCharField(term2876, term2876.getClass(), "decimalSeparator", (char) 46);
        setCharField(term2876, term2876.getClass(), "perMill", (char) 8240);
        setCharField(term2876, term2876.getClass(), "percent", (char) 37);
        setCharField(term2876, term2876.getClass(), "digit", (char) 35);
        setCharField(term2876, term2876.getClass(), "patternSeparator", (char) 59);
        setField(term2876, term2876.getClass(), "infinity", "\u001E\"");
        setField(term2876, term2876.getClass(), "NaN", "NaN");
        setCharField(term2876, term2876.getClass(), "minusSign", (char) 45);
        setField(term2876, term2876.getClass(), "currencySymbol", null);
        setField(term2876, term2876.getClass(), "intlCurrencySymbol", null);
        setCharField(term2876, term2876.getClass(), "monetarySeparator", (char) 46);
        setCharField(term2876, term2876.getClass(), "exponential", 'E');
        setField(term2876, term2876.getClass(), "exponentialSeparator", "E");
        setField(term2900, term2900.getClass(), "language", null);
        setField(term2900, term2900.getClass(), "script", null);
        setField(term2900, term2900.getClass(), "region", null);
        setField(term2900, term2900.getClass(), "variant", null);
        setIntField(term2900, term2900.getClass(), "hash", 96636889);
        setField(term2899, term2899.getClass(), "baseLocale", term2900);
        setField(term2899, term2899.getClass(), "localeExtensions", null);
        setIntField(term2899, term2899.getClass(), "hashCodeValue", 96636889);
        setField(term2899, term2899.getClass(), "languageTag", "");
        setField(term2876, term2876.getClass(), "locale", term2899);
        setField(term2876, term2876.getClass(), "currency", null);
        setBooleanField(term2876, term2876.getClass(), "currencyInitialized", false);
        setIntField(term2876, term2876.getClass(), "serialVersionOnStream", 3);
        setField(term2823, term2823.getClass(), "symbols", term2876);
        setBooleanField(term2823, term2823.getClass(), "useExponentialNotation", false);
        setField(term2823, term2823.getClass(), "positivePrefixFieldPositions", null);
        setField(term2823, term2823.getClass(), "positiveSuffixFieldPositions", null);
        setField(term2823, term2823.getClass(), "negativePrefixFieldPositions", null);
        setField(term2823, term2823.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term2823, term2823.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term2823, term2823.getClass(), "maximumIntegerDigits", 309);
        setIntField(term2823, term2823.getClass(), "minimumIntegerDigits", 1);
        setIntField(term2823, term2823.getClass(), "maximumFractionDigits", 2);
        setIntField(term2823, term2823.getClass(), "minimumFractionDigits", 0);
        setField(term2823, term2823.getClass(), "roundingMode", enum6);
        setBooleanField(term2823, term2823.getClass(), "isFastPath", false);
        setBooleanField(term2823, term2823.getClass(), "fastPathCheckNeeded", true);
        setField(term2823, term2823.getClass(), "fastPathData", null);
        setIntField(term2823, term2823.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term2823, term2823.getClass(), "groupingUsed", true);
        setByteField(term2823, term2823.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term2823, term2823.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term2823, term2823.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term2823, term2823.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term2823, term2823.getClass(), "parseIntegerOnly", false);
        setField(term2819, term2819.getClass(), "imaginaryFormat", term2823);
        setField(term2926, term2926.getClass(), "bigIntegerMultiplier", null);
        setField(term2926, term2926.getClass(), "bigDecimalMultiplier", null);
        setIntField(term2927, term2927.getClass(), "decimalAt", 0);
        setIntField(term2927, term2927.getClass(), "count", 0);
        setField(term2927, term2927.getClass(), "digits", term2930);
        setField(term2927, term2927.getClass(), "data", null);
        setField(term2927, term2927.getClass(), "roundingMode", enum6);
        setBooleanField(term2927, term2927.getClass(), "isNegative", false);
        setField(term2927, term2927.getClass(), "tempBuffer", null);
        setField(term2926, term2926.getClass(), "digitList", term2927);
        setField(term2926, term2926.getClass(), "positivePrefix", "");
        setField(term2926, term2926.getClass(), "positiveSuffix", "");
        setField(term2926, term2926.getClass(), "negativePrefix", "-");
        setField(term2926, term2926.getClass(), "negativeSuffix", "");
        setField(term2926, term2926.getClass(), "posPrefixPattern", "");
        setField(term2926, term2926.getClass(), "posSuffixPattern", "");
        setField(term2926, term2926.getClass(), "negPrefixPattern", "\'-");
        setField(term2926, term2926.getClass(), "negSuffixPattern", "");
        setIntField(term2926, term2926.getClass(), "multiplier", 1);
        setByteField(term2926, term2926.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term2926, term2926.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term2926, term2926.getClass(), "parseBigDecimal", false);
        setBooleanField(term2926, term2926.getClass(), "isCurrencyFormat", false);
        setCharField(term2975, term2975.getClass(), "zeroDigit", (char) 48);
        setCharField(term2975, term2975.getClass(), "groupingSeparator", (char) 44);
        setCharField(term2975, term2975.getClass(), "decimalSeparator", (char) 46);
        setCharField(term2975, term2975.getClass(), "perMill", (char) 8240);
        setCharField(term2975, term2975.getClass(), "percent", (char) 37);
        setCharField(term2975, term2975.getClass(), "digit", (char) 35);
        setCharField(term2975, term2975.getClass(), "patternSeparator", (char) 59);
        setField(term2975, term2975.getClass(), "infinity", "\u001E\"");
        setField(term2975, term2975.getClass(), "NaN", "NaN");
        setCharField(term2975, term2975.getClass(), "minusSign", (char) 45);
        setField(term2975, term2975.getClass(), "currencySymbol", null);
        setField(term2975, term2975.getClass(), "intlCurrencySymbol", null);
        setCharField(term2975, term2975.getClass(), "monetarySeparator", (char) 46);
        setCharField(term2975, term2975.getClass(), "exponential", 'E');
        setField(term2975, term2975.getClass(), "exponentialSeparator", "E");
        setField(term2975, term2975.getClass(), "locale", term2899);
        setField(term2975, term2975.getClass(), "currency", null);
        setBooleanField(term2975, term2975.getClass(), "currencyInitialized", false);
        setIntField(term2975, term2975.getClass(), "serialVersionOnStream", 3);
        setField(term2926, term2926.getClass(), "symbols", term2975);
        setBooleanField(term2926, term2926.getClass(), "useExponentialNotation", false);
        setField(term2926, term2926.getClass(), "positivePrefixFieldPositions", null);
        setField(term2926, term2926.getClass(), "positiveSuffixFieldPositions", null);
        setField(term2926, term2926.getClass(), "negativePrefixFieldPositions", null);
        setField(term2926, term2926.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term2926, term2926.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term2926, term2926.getClass(), "maximumIntegerDigits", 309);
        setIntField(term2926, term2926.getClass(), "minimumIntegerDigits", 1);
        setIntField(term2926, term2926.getClass(), "maximumFractionDigits", 2);
        setIntField(term2926, term2926.getClass(), "minimumFractionDigits", 0);
        setField(term2926, term2926.getClass(), "roundingMode", enum6);
        setBooleanField(term2926, term2926.getClass(), "isFastPath", false);
        setBooleanField(term2926, term2926.getClass(), "fastPathCheckNeeded", true);
        setField(term2926, term2926.getClass(), "fastPathData", null);
        setIntField(term2926, term2926.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term2926, term2926.getClass(), "groupingUsed", true);
        setByteField(term2926, term2926.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term2926, term2926.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term2926, term2926.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term2926, term2926.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term2926, term2926.getClass(), "parseIntegerOnly", false);
        setField(term2819, term2819.getClass(), "realFormat", term2926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "parse", argTypes, term2819, args);
    }

};


