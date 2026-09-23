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

public class ComplexFormat_init_101156552928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7614;

    public ComplexFormat_init_101156552928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7695 = Class.forName((String) "java.math.RoundingMode");
        Field term7694 = ((Class) term7695).getDeclaredField((String) "HALF_UP");
        ((Field) term7694).setAccessible(true);
        Object enum16 = ((Field) term7694).get((Object) null);
        term7614 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term7617 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term7618 = newInstance(Class.forName("java.text.DigitList"));
        char[] term7619 = (char[]) newCharArray(19);
        Object term7638 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term7645 = newInstance(Class.forName("java.util.Locale"));
        Object term7646 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term7648 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term7649 = newInstance(Class.forName("java.text.DigitList"));
        char[] term7650 = (char[]) newCharArray(19);
        Object term7667 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term7614, term7614.getClass(), "imaginaryCharacter", "i");
        setField(term7617, term7617.getClass(), "bigIntegerMultiplier", null);
        setField(term7617, term7617.getClass(), "bigDecimalMultiplier", null);
        setIntField(term7618, term7618.getClass(), "decimalAt", 0);
        setIntField(term7618, term7618.getClass(), "count", 0);
        setField(term7618, term7618.getClass(), "digits", term7619);
        setField(term7618, term7618.getClass(), "data", null);
        setField(term7618, term7618.getClass(), "roundingMode", enum16);
        setBooleanField(term7618, term7618.getClass(), "isNegative", false);
        setField(term7618, term7618.getClass(), "tempBuffer", null);
        setField(term7617, term7617.getClass(), "digitList", term7618);
        setField(term7617, term7617.getClass(), "positivePrefix", "");
        setField(term7617, term7617.getClass(), "positiveSuffix", "");
        setField(term7617, term7617.getClass(), "negativePrefix", "-");
        setField(term7617, term7617.getClass(), "negativeSuffix", "");
        setField(term7617, term7617.getClass(), "posPrefixPattern", "");
        setField(term7617, term7617.getClass(), "posSuffixPattern", "");
        setField(term7617, term7617.getClass(), "negPrefixPattern", "\'-");
        setField(term7617, term7617.getClass(), "negSuffixPattern", "");
        setIntField(term7617, term7617.getClass(), "multiplier", 1);
        setByteField(term7617, term7617.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term7617, term7617.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term7617, term7617.getClass(), "parseBigDecimal", false);
        setBooleanField(term7617, term7617.getClass(), "isCurrencyFormat", false);
        setCharField(term7638, term7638.getClass(), "zeroDigit", (char) 48);
        setCharField(term7638, term7638.getClass(), "groupingSeparator", (char) 44);
        setCharField(term7638, term7638.getClass(), "decimalSeparator", (char) 46);
        setCharField(term7638, term7638.getClass(), "perMill", (char) 8240);
        setCharField(term7638, term7638.getClass(), "percent", (char) 37);
        setCharField(term7638, term7638.getClass(), "digit", (char) 35);
        setCharField(term7638, term7638.getClass(), "patternSeparator", (char) 59);
        setField(term7638, term7638.getClass(), "infinity", "\u001E\"");
        setField(term7638, term7638.getClass(), "NaN", "NaN");
        setCharField(term7638, term7638.getClass(), "minusSign", (char) 45);
        setField(term7638, term7638.getClass(), "currencySymbol", null);
        setField(term7638, term7638.getClass(), "intlCurrencySymbol", null);
        setCharField(term7638, term7638.getClass(), "monetarySeparator", (char) 46);
        setCharField(term7638, term7638.getClass(), "exponential", 'E');
        setField(term7638, term7638.getClass(), "exponentialSeparator", "E");
        setField(term7646, term7646.getClass(), "language", null);
        setField(term7646, term7646.getClass(), "script", null);
        setField(term7646, term7646.getClass(), "region", null);
        setField(term7646, term7646.getClass(), "variant", null);
        setIntField(term7646, term7646.getClass(), "hash", 96636889);
        setField(term7645, term7645.getClass(), "baseLocale", term7646);
        setField(term7645, term7645.getClass(), "localeExtensions", null);
        setIntField(term7645, term7645.getClass(), "hashCodeValue", 96636889);
        setField(term7645, term7645.getClass(), "languageTag", "");
        setField(term7638, term7638.getClass(), "locale", term7645);
        setField(term7638, term7638.getClass(), "currency", null);
        setBooleanField(term7638, term7638.getClass(), "currencyInitialized", false);
        setIntField(term7638, term7638.getClass(), "serialVersionOnStream", 3);
        setField(term7617, term7617.getClass(), "symbols", term7638);
        setBooleanField(term7617, term7617.getClass(), "useExponentialNotation", false);
        setField(term7617, term7617.getClass(), "positivePrefixFieldPositions", null);
        setField(term7617, term7617.getClass(), "positiveSuffixFieldPositions", null);
        setField(term7617, term7617.getClass(), "negativePrefixFieldPositions", null);
        setField(term7617, term7617.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term7617, term7617.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term7617, term7617.getClass(), "maximumIntegerDigits", 309);
        setIntField(term7617, term7617.getClass(), "minimumIntegerDigits", 1);
        setIntField(term7617, term7617.getClass(), "maximumFractionDigits", 2);
        setIntField(term7617, term7617.getClass(), "minimumFractionDigits", 0);
        setField(term7617, term7617.getClass(), "roundingMode", enum16);
        setBooleanField(term7617, term7617.getClass(), "isFastPath", false);
        setBooleanField(term7617, term7617.getClass(), "fastPathCheckNeeded", true);
        setField(term7617, term7617.getClass(), "fastPathData", null);
        setIntField(term7617, term7617.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term7617, term7617.getClass(), "groupingUsed", true);
        setByteField(term7617, term7617.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term7617, term7617.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term7617, term7617.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term7617, term7617.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term7617, term7617.getClass(), "parseIntegerOnly", false);
        setField(term7614, term7614.getClass(), "imaginaryFormat", term7617);
        setField(term7648, term7648.getClass(), "bigIntegerMultiplier", null);
        setField(term7648, term7648.getClass(), "bigDecimalMultiplier", null);
        setIntField(term7649, term7649.getClass(), "decimalAt", 0);
        setIntField(term7649, term7649.getClass(), "count", 0);
        setField(term7649, term7649.getClass(), "digits", term7650);
        setField(term7649, term7649.getClass(), "data", null);
        setField(term7649, term7649.getClass(), "roundingMode", enum16);
        setBooleanField(term7649, term7649.getClass(), "isNegative", false);
        setField(term7649, term7649.getClass(), "tempBuffer", null);
        setField(term7648, term7648.getClass(), "digitList", term7649);
        setField(term7648, term7648.getClass(), "positivePrefix", "");
        setField(term7648, term7648.getClass(), "positiveSuffix", "");
        setField(term7648, term7648.getClass(), "negativePrefix", "-");
        setField(term7648, term7648.getClass(), "negativeSuffix", "");
        setField(term7648, term7648.getClass(), "posPrefixPattern", "");
        setField(term7648, term7648.getClass(), "posSuffixPattern", "");
        setField(term7648, term7648.getClass(), "negPrefixPattern", "\'-");
        setField(term7648, term7648.getClass(), "negSuffixPattern", "");
        setIntField(term7648, term7648.getClass(), "multiplier", 1);
        setByteField(term7648, term7648.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term7648, term7648.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term7648, term7648.getClass(), "parseBigDecimal", false);
        setBooleanField(term7648, term7648.getClass(), "isCurrencyFormat", false);
        setCharField(term7667, term7667.getClass(), "zeroDigit", (char) 48);
        setCharField(term7667, term7667.getClass(), "groupingSeparator", (char) 44);
        setCharField(term7667, term7667.getClass(), "decimalSeparator", (char) 46);
        setCharField(term7667, term7667.getClass(), "perMill", (char) 8240);
        setCharField(term7667, term7667.getClass(), "percent", (char) 37);
        setCharField(term7667, term7667.getClass(), "digit", (char) 35);
        setCharField(term7667, term7667.getClass(), "patternSeparator", (char) 59);
        setField(term7667, term7667.getClass(), "infinity", "\u001E\"");
        setField(term7667, term7667.getClass(), "NaN", "NaN");
        setCharField(term7667, term7667.getClass(), "minusSign", (char) 45);
        setField(term7667, term7667.getClass(), "currencySymbol", null);
        setField(term7667, term7667.getClass(), "intlCurrencySymbol", null);
        setCharField(term7667, term7667.getClass(), "monetarySeparator", (char) 46);
        setCharField(term7667, term7667.getClass(), "exponential", 'E');
        setField(term7667, term7667.getClass(), "exponentialSeparator", "E");
        setField(term7667, term7667.getClass(), "locale", term7645);
        setField(term7667, term7667.getClass(), "currency", null);
        setBooleanField(term7667, term7667.getClass(), "currencyInitialized", false);
        setIntField(term7667, term7667.getClass(), "serialVersionOnStream", 3);
        setField(term7648, term7648.getClass(), "symbols", term7667);
        setBooleanField(term7648, term7648.getClass(), "useExponentialNotation", false);
        setField(term7648, term7648.getClass(), "positivePrefixFieldPositions", null);
        setField(term7648, term7648.getClass(), "positiveSuffixFieldPositions", null);
        setField(term7648, term7648.getClass(), "negativePrefixFieldPositions", null);
        setField(term7648, term7648.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term7648, term7648.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term7648, term7648.getClass(), "maximumIntegerDigits", 309);
        setIntField(term7648, term7648.getClass(), "minimumIntegerDigits", 1);
        setIntField(term7648, term7648.getClass(), "maximumFractionDigits", 2);
        setIntField(term7648, term7648.getClass(), "minimumFractionDigits", 0);
        setField(term7648, term7648.getClass(), "roundingMode", enum16);
        setBooleanField(term7648, term7648.getClass(), "isFastPath", false);
        setBooleanField(term7648, term7648.getClass(), "fastPathCheckNeeded", true);
        setField(term7648, term7648.getClass(), "fastPathData", null);
        setIntField(term7648, term7648.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term7648, term7648.getClass(), "groupingUsed", true);
        setByteField(term7648, term7648.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term7648, term7648.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term7648, term7648.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term7648, term7648.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term7648, term7648.getClass(), "parseIntegerOnly", false);
        setField(term7614, term7614.getClass(), "realFormat", term7648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7614));
    }

};


