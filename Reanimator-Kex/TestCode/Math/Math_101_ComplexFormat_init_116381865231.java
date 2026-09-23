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
import static org.apache.commons.math.complex.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class ComplexFormat_init_116381865231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9277;

    public ComplexFormat_init_116381865231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9379 = Class.forName((String) "java.math.RoundingMode");
        Field term9378 = ((Class) term9379).getDeclaredField((String) "HALF_DOWN");
        ((Field) term9378).setAccessible(true);
        Object enum17 = ((Field) term9378).get((Object) null);
        term9277 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term9280 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term9281 = newInstance(Class.forName("java.text.DigitList"));
        char[] term9282 = (char[]) newCharArray(19);
        Object term9301 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term9308 = newInstance(Class.forName("java.util.Locale"));
        Object term9309 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term9311 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term9312 = newInstance(Class.forName("java.text.DigitList"));
        char[] term9313 = (char[]) newCharArray(19);
        Object term9330 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term9277, term9277.getClass(), "imaginaryCharacter", "PAEBtnZtTD");
        setField(term9280, term9280.getClass(), "bigIntegerMultiplier", null);
        setField(term9280, term9280.getClass(), "bigDecimalMultiplier", null);
        setIntField(term9281, term9281.getClass(), "decimalAt", 0);
        setIntField(term9281, term9281.getClass(), "count", 0);
        setField(term9281, term9281.getClass(), "digits", term9282);
        setField(term9281, term9281.getClass(), "data", null);
        setField(term9281, term9281.getClass(), "roundingMode", enum17);
        setBooleanField(term9281, term9281.getClass(), "isNegative", false);
        setField(term9281, term9281.getClass(), "tempBuffer", null);
        setField(term9280, term9280.getClass(), "digitList", term9281);
        setField(term9280, term9280.getClass(), "positivePrefix", "");
        setField(term9280, term9280.getClass(), "positiveSuffix", "");
        setField(term9280, term9280.getClass(), "negativePrefix", "-");
        setField(term9280, term9280.getClass(), "negativeSuffix", "");
        setField(term9280, term9280.getClass(), "posPrefixPattern", "");
        setField(term9280, term9280.getClass(), "posSuffixPattern", "");
        setField(term9280, term9280.getClass(), "negPrefixPattern", "\'-");
        setField(term9280, term9280.getClass(), "negSuffixPattern", "");
        setIntField(term9280, term9280.getClass(), "multiplier", 1);
        setByteField(term9280, term9280.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term9280, term9280.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term9280, term9280.getClass(), "parseBigDecimal", false);
        setBooleanField(term9280, term9280.getClass(), "isCurrencyFormat", false);
        setCharField(term9301, term9301.getClass(), "zeroDigit", (char) 48);
        setCharField(term9301, term9301.getClass(), "groupingSeparator", (char) 44);
        setCharField(term9301, term9301.getClass(), "decimalSeparator", (char) 46);
        setCharField(term9301, term9301.getClass(), "perMill", (char) 8240);
        setCharField(term9301, term9301.getClass(), "percent", (char) 37);
        setCharField(term9301, term9301.getClass(), "digit", (char) 35);
        setCharField(term9301, term9301.getClass(), "patternSeparator", (char) 59);
        setField(term9301, term9301.getClass(), "infinity", "\u001E\"");
        setField(term9301, term9301.getClass(), "NaN", "NaN");
        setCharField(term9301, term9301.getClass(), "minusSign", (char) 45);
        setField(term9301, term9301.getClass(), "currencySymbol", null);
        setField(term9301, term9301.getClass(), "intlCurrencySymbol", null);
        setCharField(term9301, term9301.getClass(), "monetarySeparator", (char) 46);
        setCharField(term9301, term9301.getClass(), "exponential", 'E');
        setField(term9301, term9301.getClass(), "exponentialSeparator", "E");
        setField(term9309, term9309.getClass(), "language", null);
        setField(term9309, term9309.getClass(), "script", null);
        setField(term9309, term9309.getClass(), "region", null);
        setField(term9309, term9309.getClass(), "variant", null);
        setIntField(term9309, term9309.getClass(), "hash", 96636889);
        setField(term9308, term9308.getClass(), "baseLocale", term9309);
        setField(term9308, term9308.getClass(), "localeExtensions", null);
        setIntField(term9308, term9308.getClass(), "hashCodeValue", 96636889);
        setField(term9308, term9308.getClass(), "languageTag", "");
        setField(term9301, term9301.getClass(), "locale", term9308);
        setField(term9301, term9301.getClass(), "currency", null);
        setBooleanField(term9301, term9301.getClass(), "currencyInitialized", false);
        setIntField(term9301, term9301.getClass(), "serialVersionOnStream", 3);
        setField(term9280, term9280.getClass(), "symbols", term9301);
        setBooleanField(term9280, term9280.getClass(), "useExponentialNotation", false);
        setField(term9280, term9280.getClass(), "positivePrefixFieldPositions", null);
        setField(term9280, term9280.getClass(), "positiveSuffixFieldPositions", null);
        setField(term9280, term9280.getClass(), "negativePrefixFieldPositions", null);
        setField(term9280, term9280.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term9280, term9280.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term9280, term9280.getClass(), "maximumIntegerDigits", 309);
        setIntField(term9280, term9280.getClass(), "minimumIntegerDigits", 1);
        setIntField(term9280, term9280.getClass(), "maximumFractionDigits", 2);
        setIntField(term9280, term9280.getClass(), "minimumFractionDigits", 0);
        setField(term9280, term9280.getClass(), "roundingMode", enum17);
        setBooleanField(term9280, term9280.getClass(), "isFastPath", false);
        setBooleanField(term9280, term9280.getClass(), "fastPathCheckNeeded", true);
        setField(term9280, term9280.getClass(), "fastPathData", null);
        setIntField(term9280, term9280.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term9280, term9280.getClass(), "groupingUsed", true);
        setByteField(term9280, term9280.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term9280, term9280.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term9280, term9280.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term9280, term9280.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term9280, term9280.getClass(), "parseIntegerOnly", false);
        setField(term9277, term9277.getClass(), "imaginaryFormat", term9280);
        setField(term9311, term9311.getClass(), "bigIntegerMultiplier", null);
        setField(term9311, term9311.getClass(), "bigDecimalMultiplier", null);
        setIntField(term9312, term9312.getClass(), "decimalAt", 0);
        setIntField(term9312, term9312.getClass(), "count", 0);
        setField(term9312, term9312.getClass(), "digits", term9313);
        setField(term9312, term9312.getClass(), "data", null);
        setField(term9312, term9312.getClass(), "roundingMode", enum17);
        setBooleanField(term9312, term9312.getClass(), "isNegative", false);
        setField(term9312, term9312.getClass(), "tempBuffer", null);
        setField(term9311, term9311.getClass(), "digitList", term9312);
        setField(term9311, term9311.getClass(), "positivePrefix", "");
        setField(term9311, term9311.getClass(), "positiveSuffix", "");
        setField(term9311, term9311.getClass(), "negativePrefix", "-");
        setField(term9311, term9311.getClass(), "negativeSuffix", "");
        setField(term9311, term9311.getClass(), "posPrefixPattern", "");
        setField(term9311, term9311.getClass(), "posSuffixPattern", "");
        setField(term9311, term9311.getClass(), "negPrefixPattern", "\'-");
        setField(term9311, term9311.getClass(), "negSuffixPattern", "");
        setIntField(term9311, term9311.getClass(), "multiplier", 1);
        setByteField(term9311, term9311.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term9311, term9311.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term9311, term9311.getClass(), "parseBigDecimal", false);
        setBooleanField(term9311, term9311.getClass(), "isCurrencyFormat", false);
        setCharField(term9330, term9330.getClass(), "zeroDigit", (char) 48);
        setCharField(term9330, term9330.getClass(), "groupingSeparator", (char) 44);
        setCharField(term9330, term9330.getClass(), "decimalSeparator", (char) 46);
        setCharField(term9330, term9330.getClass(), "perMill", (char) 8240);
        setCharField(term9330, term9330.getClass(), "percent", (char) 37);
        setCharField(term9330, term9330.getClass(), "digit", (char) 35);
        setCharField(term9330, term9330.getClass(), "patternSeparator", (char) 59);
        setField(term9330, term9330.getClass(), "infinity", "\u001E\"");
        setField(term9330, term9330.getClass(), "NaN", "NaN");
        setCharField(term9330, term9330.getClass(), "minusSign", (char) 45);
        setField(term9330, term9330.getClass(), "currencySymbol", null);
        setField(term9330, term9330.getClass(), "intlCurrencySymbol", null);
        setCharField(term9330, term9330.getClass(), "monetarySeparator", (char) 46);
        setCharField(term9330, term9330.getClass(), "exponential", 'E');
        setField(term9330, term9330.getClass(), "exponentialSeparator", "E");
        setField(term9330, term9330.getClass(), "locale", term9308);
        setField(term9330, term9330.getClass(), "currency", null);
        setBooleanField(term9330, term9330.getClass(), "currencyInitialized", false);
        setIntField(term9330, term9330.getClass(), "serialVersionOnStream", 3);
        setField(term9311, term9311.getClass(), "symbols", term9330);
        setBooleanField(term9311, term9311.getClass(), "useExponentialNotation", false);
        setField(term9311, term9311.getClass(), "positivePrefixFieldPositions", null);
        setField(term9311, term9311.getClass(), "positiveSuffixFieldPositions", null);
        setField(term9311, term9311.getClass(), "negativePrefixFieldPositions", null);
        setField(term9311, term9311.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term9311, term9311.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term9311, term9311.getClass(), "maximumIntegerDigits", 309);
        setIntField(term9311, term9311.getClass(), "minimumIntegerDigits", 1);
        setIntField(term9311, term9311.getClass(), "maximumFractionDigits", 2);
        setIntField(term9311, term9311.getClass(), "minimumFractionDigits", 0);
        setField(term9311, term9311.getClass(), "roundingMode", enum17);
        setBooleanField(term9311, term9311.getClass(), "isFastPath", false);
        setBooleanField(term9311, term9311.getClass(), "fastPathCheckNeeded", true);
        setField(term9311, term9311.getClass(), "fastPathData", null);
        setIntField(term9311, term9311.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term9311, term9311.getClass(), "groupingUsed", true);
        setByteField(term9311, term9311.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term9311, term9311.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term9311, term9311.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term9311, term9311.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term9311, term9311.getClass(), "parseIntegerOnly", false);
        setField(term9277, term9277.getClass(), "realFormat", term9311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9277));
    }

};


