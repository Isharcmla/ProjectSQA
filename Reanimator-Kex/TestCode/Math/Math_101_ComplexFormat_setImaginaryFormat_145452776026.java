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

public class ComplexFormat_setImaginaryFormat_145452776026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6201;

    public ComplexFormat_setImaginaryFormat_145452776026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6423 = Class.forName((String) "java.math.RoundingMode");
        Field term6422 = ((Class) term6423).getDeclaredField((String) "CEILING");
        ((Field) term6422).setAccessible(true);
        Object enum14 = ((Field) term6422).get((Object) null);
        term6201 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term6205 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term6206 = newInstance(Class.forName("java.text.DigitList"));
        char[] term6209 = (char[]) newCharArray(19);
        Object term6258 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term6281 = newInstance(Class.forName("java.util.Locale"));
        Object term6282 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6308 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term6309 = newInstance(Class.forName("java.text.DigitList"));
        char[] term6312 = (char[]) newCharArray(19);
        Object term6357 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term6201, term6201.getClass(), "imaginaryCharacter", "i");
        setField(term6205, term6205.getClass(), "bigIntegerMultiplier", null);
        setField(term6205, term6205.getClass(), "bigDecimalMultiplier", null);
        setIntField(term6206, term6206.getClass(), "decimalAt", 0);
        setIntField(term6206, term6206.getClass(), "count", 0);
        setField(term6206, term6206.getClass(), "digits", term6209);
        setField(term6206, term6206.getClass(), "data", null);
        setField(term6206, term6206.getClass(), "roundingMode", enum14);
        setBooleanField(term6206, term6206.getClass(), "isNegative", false);
        setField(term6206, term6206.getClass(), "tempBuffer", null);
        setField(term6205, term6205.getClass(), "digitList", term6206);
        setField(term6205, term6205.getClass(), "positivePrefix", "");
        setField(term6205, term6205.getClass(), "positiveSuffix", "");
        setField(term6205, term6205.getClass(), "negativePrefix", "-");
        setField(term6205, term6205.getClass(), "negativeSuffix", "");
        setField(term6205, term6205.getClass(), "posPrefixPattern", "");
        setField(term6205, term6205.getClass(), "posSuffixPattern", "");
        setField(term6205, term6205.getClass(), "negPrefixPattern", "\'-");
        setField(term6205, term6205.getClass(), "negSuffixPattern", "");
        setIntField(term6205, term6205.getClass(), "multiplier", 1);
        setByteField(term6205, term6205.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term6205, term6205.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term6205, term6205.getClass(), "parseBigDecimal", false);
        setBooleanField(term6205, term6205.getClass(), "isCurrencyFormat", false);
        setCharField(term6258, term6258.getClass(), "zeroDigit", (char) 48);
        setCharField(term6258, term6258.getClass(), "groupingSeparator", (char) 44);
        setCharField(term6258, term6258.getClass(), "decimalSeparator", (char) 46);
        setCharField(term6258, term6258.getClass(), "perMill", (char) 8240);
        setCharField(term6258, term6258.getClass(), "percent", (char) 37);
        setCharField(term6258, term6258.getClass(), "digit", (char) 35);
        setCharField(term6258, term6258.getClass(), "patternSeparator", (char) 59);
        setField(term6258, term6258.getClass(), "infinity", "\u001E\"");
        setField(term6258, term6258.getClass(), "NaN", "NaN");
        setCharField(term6258, term6258.getClass(), "minusSign", (char) 45);
        setField(term6258, term6258.getClass(), "currencySymbol", null);
        setField(term6258, term6258.getClass(), "intlCurrencySymbol", null);
        setCharField(term6258, term6258.getClass(), "monetarySeparator", (char) 46);
        setCharField(term6258, term6258.getClass(), "exponential", 'E');
        setField(term6258, term6258.getClass(), "exponentialSeparator", "E");
        setField(term6282, term6282.getClass(), "language", null);
        setField(term6282, term6282.getClass(), "script", null);
        setField(term6282, term6282.getClass(), "region", null);
        setField(term6282, term6282.getClass(), "variant", null);
        setIntField(term6282, term6282.getClass(), "hash", 96636889);
        setField(term6281, term6281.getClass(), "baseLocale", term6282);
        setField(term6281, term6281.getClass(), "localeExtensions", null);
        setIntField(term6281, term6281.getClass(), "hashCodeValue", 96636889);
        setField(term6281, term6281.getClass(), "languageTag", "");
        setField(term6258, term6258.getClass(), "locale", term6281);
        setField(term6258, term6258.getClass(), "currency", null);
        setBooleanField(term6258, term6258.getClass(), "currencyInitialized", false);
        setIntField(term6258, term6258.getClass(), "serialVersionOnStream", 3);
        setField(term6205, term6205.getClass(), "symbols", term6258);
        setBooleanField(term6205, term6205.getClass(), "useExponentialNotation", false);
        setField(term6205, term6205.getClass(), "positivePrefixFieldPositions", null);
        setField(term6205, term6205.getClass(), "positiveSuffixFieldPositions", null);
        setField(term6205, term6205.getClass(), "negativePrefixFieldPositions", null);
        setField(term6205, term6205.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term6205, term6205.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term6205, term6205.getClass(), "maximumIntegerDigits", 309);
        setIntField(term6205, term6205.getClass(), "minimumIntegerDigits", 1);
        setIntField(term6205, term6205.getClass(), "maximumFractionDigits", 2);
        setIntField(term6205, term6205.getClass(), "minimumFractionDigits", 0);
        setField(term6205, term6205.getClass(), "roundingMode", enum14);
        setBooleanField(term6205, term6205.getClass(), "isFastPath", false);
        setBooleanField(term6205, term6205.getClass(), "fastPathCheckNeeded", true);
        setField(term6205, term6205.getClass(), "fastPathData", null);
        setIntField(term6205, term6205.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term6205, term6205.getClass(), "groupingUsed", true);
        setByteField(term6205, term6205.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term6205, term6205.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term6205, term6205.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term6205, term6205.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term6205, term6205.getClass(), "parseIntegerOnly", false);
        setField(term6201, term6201.getClass(), "imaginaryFormat", term6205);
        setField(term6308, term6308.getClass(), "bigIntegerMultiplier", null);
        setField(term6308, term6308.getClass(), "bigDecimalMultiplier", null);
        setIntField(term6309, term6309.getClass(), "decimalAt", 0);
        setIntField(term6309, term6309.getClass(), "count", 0);
        setField(term6309, term6309.getClass(), "digits", term6312);
        setField(term6309, term6309.getClass(), "data", null);
        setField(term6309, term6309.getClass(), "roundingMode", enum14);
        setBooleanField(term6309, term6309.getClass(), "isNegative", false);
        setField(term6309, term6309.getClass(), "tempBuffer", null);
        setField(term6308, term6308.getClass(), "digitList", term6309);
        setField(term6308, term6308.getClass(), "positivePrefix", "");
        setField(term6308, term6308.getClass(), "positiveSuffix", "");
        setField(term6308, term6308.getClass(), "negativePrefix", "-");
        setField(term6308, term6308.getClass(), "negativeSuffix", "");
        setField(term6308, term6308.getClass(), "posPrefixPattern", "");
        setField(term6308, term6308.getClass(), "posSuffixPattern", "");
        setField(term6308, term6308.getClass(), "negPrefixPattern", "\'-");
        setField(term6308, term6308.getClass(), "negSuffixPattern", "");
        setIntField(term6308, term6308.getClass(), "multiplier", 1);
        setByteField(term6308, term6308.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term6308, term6308.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term6308, term6308.getClass(), "parseBigDecimal", false);
        setBooleanField(term6308, term6308.getClass(), "isCurrencyFormat", false);
        setCharField(term6357, term6357.getClass(), "zeroDigit", (char) 48);
        setCharField(term6357, term6357.getClass(), "groupingSeparator", (char) 44);
        setCharField(term6357, term6357.getClass(), "decimalSeparator", (char) 46);
        setCharField(term6357, term6357.getClass(), "perMill", (char) 8240);
        setCharField(term6357, term6357.getClass(), "percent", (char) 37);
        setCharField(term6357, term6357.getClass(), "digit", (char) 35);
        setCharField(term6357, term6357.getClass(), "patternSeparator", (char) 59);
        setField(term6357, term6357.getClass(), "infinity", "\u001E\"");
        setField(term6357, term6357.getClass(), "NaN", "NaN");
        setCharField(term6357, term6357.getClass(), "minusSign", (char) 45);
        setField(term6357, term6357.getClass(), "currencySymbol", null);
        setField(term6357, term6357.getClass(), "intlCurrencySymbol", null);
        setCharField(term6357, term6357.getClass(), "monetarySeparator", (char) 46);
        setCharField(term6357, term6357.getClass(), "exponential", 'E');
        setField(term6357, term6357.getClass(), "exponentialSeparator", "E");
        setField(term6357, term6357.getClass(), "locale", term6281);
        setField(term6357, term6357.getClass(), "currency", null);
        setBooleanField(term6357, term6357.getClass(), "currencyInitialized", false);
        setIntField(term6357, term6357.getClass(), "serialVersionOnStream", 3);
        setField(term6308, term6308.getClass(), "symbols", term6357);
        setBooleanField(term6308, term6308.getClass(), "useExponentialNotation", false);
        setField(term6308, term6308.getClass(), "positivePrefixFieldPositions", null);
        setField(term6308, term6308.getClass(), "positiveSuffixFieldPositions", null);
        setField(term6308, term6308.getClass(), "negativePrefixFieldPositions", null);
        setField(term6308, term6308.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term6308, term6308.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term6308, term6308.getClass(), "maximumIntegerDigits", 309);
        setIntField(term6308, term6308.getClass(), "minimumIntegerDigits", 1);
        setIntField(term6308, term6308.getClass(), "maximumFractionDigits", 2);
        setIntField(term6308, term6308.getClass(), "minimumFractionDigits", 0);
        setField(term6308, term6308.getClass(), "roundingMode", enum14);
        setBooleanField(term6308, term6308.getClass(), "isFastPath", false);
        setBooleanField(term6308, term6308.getClass(), "fastPathCheckNeeded", true);
        setField(term6308, term6308.getClass(), "fastPathData", null);
        setIntField(term6308, term6308.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term6308, term6308.getClass(), "groupingUsed", true);
        setByteField(term6308, term6308.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term6308, term6308.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term6308, term6308.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term6308, term6308.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term6308, term6308.getClass(), "parseIntegerOnly", false);
        setField(term6201, term6201.getClass(), "realFormat", term6308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.text.NumberFormat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImaginaryFormat", argTypes, term6201, args);
    }

};


