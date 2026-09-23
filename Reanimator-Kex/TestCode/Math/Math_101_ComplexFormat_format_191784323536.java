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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ComplexFormat_format_191784323536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;
     Object term840;
     Object term841;
     Object term873;

    public ComplexFormat_format_191784323536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13410 = Class.forName((String) "java.math.RoundingMode");
        Field term13409 = ((Class) term13410).getDeclaredField((String) "UNNECESSARY");
        ((Field) term13409).setAccessible(true);
        Object enum21 = ((Field) term13409).get((Object) null);
        term639 = newInstance(Class.forName("org.apache.commons.math.complex.ComplexFormat"));
        Object term643 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term644 = newInstance(Class.forName("java.text.DigitList"));
        char[] term647 = (char[]) newCharArray(19);
        Object term696 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        Object term719 = newInstance(Class.forName("java.util.Locale"));
        Object term720 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term746 = newInstance(Class.forName("java.text.DecimalFormat"));
        Object term747 = newInstance(Class.forName("java.text.DigitList"));
        char[] term750 = (char[]) newCharArray(19);
        Object term795 = newInstance(Class.forName("java.text.DecimalFormatSymbols"));
        setField(term639, term639.getClass(), "imaginaryCharacter", "i");
        setField(term643, term643.getClass(), "bigIntegerMultiplier", null);
        setField(term643, term643.getClass(), "bigDecimalMultiplier", null);
        setIntField(term644, term644.getClass(), "decimalAt", 0);
        setIntField(term644, term644.getClass(), "count", 0);
        setField(term644, term644.getClass(), "digits", term647);
        setField(term644, term644.getClass(), "data", null);
        setField(term644, term644.getClass(), "roundingMode", enum21);
        setBooleanField(term644, term644.getClass(), "isNegative", false);
        setField(term644, term644.getClass(), "tempBuffer", null);
        setField(term643, term643.getClass(), "digitList", term644);
        setField(term643, term643.getClass(), "positivePrefix", "");
        setField(term643, term643.getClass(), "positiveSuffix", "");
        setField(term643, term643.getClass(), "negativePrefix", "-");
        setField(term643, term643.getClass(), "negativeSuffix", "");
        setField(term643, term643.getClass(), "posPrefixPattern", "");
        setField(term643, term643.getClass(), "posSuffixPattern", "");
        setField(term643, term643.getClass(), "negPrefixPattern", "\'-");
        setField(term643, term643.getClass(), "negSuffixPattern", "");
        setIntField(term643, term643.getClass(), "multiplier", 1);
        setByteField(term643, term643.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term643, term643.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term643, term643.getClass(), "parseBigDecimal", false);
        setBooleanField(term643, term643.getClass(), "isCurrencyFormat", false);
        setCharField(term696, term696.getClass(), "zeroDigit", (char) 48);
        setCharField(term696, term696.getClass(), "groupingSeparator", (char) 44);
        setCharField(term696, term696.getClass(), "decimalSeparator", (char) 46);
        setCharField(term696, term696.getClass(), "perMill", (char) 8240);
        setCharField(term696, term696.getClass(), "percent", (char) 37);
        setCharField(term696, term696.getClass(), "digit", (char) 35);
        setCharField(term696, term696.getClass(), "patternSeparator", (char) 59);
        setField(term696, term696.getClass(), "infinity", "\u001E\"");
        setField(term696, term696.getClass(), "NaN", "NaN");
        setCharField(term696, term696.getClass(), "minusSign", (char) 45);
        setField(term696, term696.getClass(), "currencySymbol", null);
        setField(term696, term696.getClass(), "intlCurrencySymbol", null);
        setCharField(term696, term696.getClass(), "monetarySeparator", (char) 46);
        setCharField(term696, term696.getClass(), "exponential", 'E');
        setField(term696, term696.getClass(), "exponentialSeparator", "E");
        setField(term720, term720.getClass(), "language", null);
        setField(term720, term720.getClass(), "script", null);
        setField(term720, term720.getClass(), "region", null);
        setField(term720, term720.getClass(), "variant", null);
        setIntField(term720, term720.getClass(), "hash", 96636889);
        setField(term719, term719.getClass(), "baseLocale", term720);
        setField(term719, term719.getClass(), "localeExtensions", null);
        setIntField(term719, term719.getClass(), "hashCodeValue", 96636889);
        setField(term719, term719.getClass(), "languageTag", "");
        setField(term696, term696.getClass(), "locale", term719);
        setField(term696, term696.getClass(), "currency", null);
        setBooleanField(term696, term696.getClass(), "currencyInitialized", false);
        setIntField(term696, term696.getClass(), "serialVersionOnStream", 3);
        setField(term643, term643.getClass(), "symbols", term696);
        setBooleanField(term643, term643.getClass(), "useExponentialNotation", false);
        setField(term643, term643.getClass(), "positivePrefixFieldPositions", null);
        setField(term643, term643.getClass(), "positiveSuffixFieldPositions", null);
        setField(term643, term643.getClass(), "negativePrefixFieldPositions", null);
        setField(term643, term643.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term643, term643.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term643, term643.getClass(), "maximumIntegerDigits", 309);
        setIntField(term643, term643.getClass(), "minimumIntegerDigits", 1);
        setIntField(term643, term643.getClass(), "maximumFractionDigits", 2);
        setIntField(term643, term643.getClass(), "minimumFractionDigits", 0);
        setField(term643, term643.getClass(), "roundingMode", enum21);
        setBooleanField(term643, term643.getClass(), "isFastPath", false);
        setBooleanField(term643, term643.getClass(), "fastPathCheckNeeded", true);
        setField(term643, term643.getClass(), "fastPathData", null);
        setIntField(term643, term643.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term643, term643.getClass(), "groupingUsed", true);
        setByteField(term643, term643.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term643, term643.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term643, term643.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term643, term643.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term643, term643.getClass(), "parseIntegerOnly", false);
        setField(term639, term639.getClass(), "imaginaryFormat", term643);
        setField(term746, term746.getClass(), "bigIntegerMultiplier", null);
        setField(term746, term746.getClass(), "bigDecimalMultiplier", null);
        setIntField(term747, term747.getClass(), "decimalAt", 0);
        setIntField(term747, term747.getClass(), "count", 0);
        setField(term747, term747.getClass(), "digits", term750);
        setField(term747, term747.getClass(), "data", null);
        setField(term747, term747.getClass(), "roundingMode", enum21);
        setBooleanField(term747, term747.getClass(), "isNegative", false);
        setField(term747, term747.getClass(), "tempBuffer", null);
        setField(term746, term746.getClass(), "digitList", term747);
        setField(term746, term746.getClass(), "positivePrefix", "");
        setField(term746, term746.getClass(), "positiveSuffix", "");
        setField(term746, term746.getClass(), "negativePrefix", "-");
        setField(term746, term746.getClass(), "negativeSuffix", "");
        setField(term746, term746.getClass(), "posPrefixPattern", "");
        setField(term746, term746.getClass(), "posSuffixPattern", "");
        setField(term746, term746.getClass(), "negPrefixPattern", "\'-");
        setField(term746, term746.getClass(), "negSuffixPattern", "");
        setIntField(term746, term746.getClass(), "multiplier", 1);
        setByteField(term746, term746.getClass(), "groupingSize", (byte) 3);
        setBooleanField(term746, term746.getClass(), "decimalSeparatorAlwaysShown", false);
        setBooleanField(term746, term746.getClass(), "parseBigDecimal", false);
        setBooleanField(term746, term746.getClass(), "isCurrencyFormat", false);
        setCharField(term795, term795.getClass(), "zeroDigit", (char) 48);
        setCharField(term795, term795.getClass(), "groupingSeparator", (char) 44);
        setCharField(term795, term795.getClass(), "decimalSeparator", (char) 46);
        setCharField(term795, term795.getClass(), "perMill", (char) 8240);
        setCharField(term795, term795.getClass(), "percent", (char) 37);
        setCharField(term795, term795.getClass(), "digit", (char) 35);
        setCharField(term795, term795.getClass(), "patternSeparator", (char) 59);
        setField(term795, term795.getClass(), "infinity", "\u001E\"");
        setField(term795, term795.getClass(), "NaN", "NaN");
        setCharField(term795, term795.getClass(), "minusSign", (char) 45);
        setField(term795, term795.getClass(), "currencySymbol", null);
        setField(term795, term795.getClass(), "intlCurrencySymbol", null);
        setCharField(term795, term795.getClass(), "monetarySeparator", (char) 46);
        setCharField(term795, term795.getClass(), "exponential", 'E');
        setField(term795, term795.getClass(), "exponentialSeparator", "E");
        setField(term795, term795.getClass(), "locale", term719);
        setField(term795, term795.getClass(), "currency", null);
        setBooleanField(term795, term795.getClass(), "currencyInitialized", false);
        setIntField(term795, term795.getClass(), "serialVersionOnStream", 3);
        setField(term746, term746.getClass(), "symbols", term795);
        setBooleanField(term746, term746.getClass(), "useExponentialNotation", false);
        setField(term746, term746.getClass(), "positivePrefixFieldPositions", null);
        setField(term746, term746.getClass(), "positiveSuffixFieldPositions", null);
        setField(term746, term746.getClass(), "negativePrefixFieldPositions", null);
        setField(term746, term746.getClass(), "negativeSuffixFieldPositions", null);
        setByteField(term746, term746.getClass(), "minExponentDigits", (byte) 0);
        setIntField(term746, term746.getClass(), "maximumIntegerDigits", 309);
        setIntField(term746, term746.getClass(), "minimumIntegerDigits", 1);
        setIntField(term746, term746.getClass(), "maximumFractionDigits", 2);
        setIntField(term746, term746.getClass(), "minimumFractionDigits", 0);
        setField(term746, term746.getClass(), "roundingMode", enum21);
        setBooleanField(term746, term746.getClass(), "isFastPath", false);
        setBooleanField(term746, term746.getClass(), "fastPathCheckNeeded", true);
        setField(term746, term746.getClass(), "fastPathData", null);
        setIntField(term746, term746.getClass(), "serialVersionOnStream", 1);
        setBooleanField(term746, term746.getClass(), "groupingUsed", true);
        setByteField(term746, term746.getClass(), "maxIntegerDigits", (byte) 40);
        setByteField(term746, term746.getClass(), "minIntegerDigits", (byte) 1);
        setByteField(term746, term746.getClass(), "maxFractionDigits", (byte) 3);
        setByteField(term746, term746.getClass(), "minFractionDigits", (byte) 0);
        setBooleanField(term746, term746.getClass(), "parseIntegerOnly", false);
        setField(term639, term639.getClass(), "realFormat", term746);
        term840 = newInstance(Class.forName("java.lang.Object"));
        term841 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term854 = (byte[]) newByteArray(16);
        setField(term841, term841.getClass(), "toStringCache", "EGtDIRbSSb");
        setField(term841, term841.getClass(), "value", term854);
        setByteField(term841, term841.getClass(), "coder", (byte) 48);
        setIntField(term841, term841.getClass(), "count", -1922583790);
        term873 = newInstance(Class.forName("java.text.FieldPosition"));
        Object term877 = newInstance(Class.forName("java.text.Format$Field"));
        setIntField(term873, term873.getClass(), "field", -616727354);
        setIntField(term873, term873.getClass(), "endIndex", -1955890973);
        setIntField(term873, term873.getClass(), "beginIndex", -2038273078);
        setField(term877, term877.getClass(), "name", "SzjVpOQTyS");
        setField(term873, term873.getClass(), "attribute", term877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.ComplexFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term840;
        args[1] = term841;
        args[2] = term873;
        try {
            callMethod(klass, "format", argTypes, term639, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


