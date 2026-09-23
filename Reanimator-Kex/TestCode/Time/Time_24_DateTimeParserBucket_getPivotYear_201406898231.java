package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeParserBucket_getPivotYear_201406898231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;
     Object term6865;
     Object term6801;

    public DateTimeParserBucket_getPivotYear_201406898231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term916 = new Integer(1227103734);
        term897 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term900 = newInstance(Class.forName("java.util.Locale"));
        Object term901 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term919 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 2);
        Object term920 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term934 = newInstance(Class.forName("java.util.Locale"));
        Object term935 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term938 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term952 = newInstance(Class.forName("java.util.Locale"));
        Object term953 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term958 = newInstance(Class.forName("java.lang.Object"));
        setField(term897, term897.getClass(), "iChrono", null);
        setLongField(term897, term897.getClass(), "iMillis", 6967924379644551255L);
        setField(term897, term897.getClass(), "iZone", null);
        setIntField(term897, term897.getClass(), "iOffset", -157887805);
        setField(term901, term901.getClass(), "language", "en");
        setField(term901, term901.getClass(), "script", "");
        setField(term901, term901.getClass(), "region", "DK");
        setField(term901, term901.getClass(), "variant", "");
        setIntField(term901, term901.getClass(), "hash", 96620304);
        setField(term900, term900.getClass(), "baseLocale", term901);
        setField(term900, term900.getClass(), "localeExtensions", null);
        setIntField(term900, term900.getClass(), "hashCodeValue", 96620304);
        setField(term900, term900.getClass(), "languageTag", null);
        setField(term897, term897.getClass(), "iLocale", term900);
        setField(term897, term897.getClass(), "iPivotYear", term916);
        setIntField(term897, term897.getClass(), "iDefaultYear", 1876565163);
        setField(term920, term920.getClass(), "iField", null);
        setIntField(term920, term920.getClass(), "iValue", -817164822);
        setField(term920, term920.getClass(), "iText", "eZFUvlxvGV");
        setField(term935, term935.getClass(), "language", null);
        setField(term935, term935.getClass(), "script", null);
        setField(term935, term935.getClass(), "region", null);
        setField(term935, term935.getClass(), "variant", null);
        setIntField(term935, term935.getClass(), "hash", 101021281);
        setField(term934, term934.getClass(), "baseLocale", term935);
        setField(term934, term934.getClass(), "localeExtensions", null);
        setIntField(term934, term934.getClass(), "hashCodeValue", 101021281);
        setField(term934, term934.getClass(), "languageTag", null);
        setField(term920, term920.getClass(), "iLocale", term934);
        setElement(term919, 0, term920);
        setField(term938, term938.getClass(), "iField", null);
        setIntField(term938, term938.getClass(), "iValue", -1016503459);
        setField(term938, term938.getClass(), "iText", "BYqFIqCKAV");
        setField(term953, term953.getClass(), "language", null);
        setField(term953, term953.getClass(), "script", null);
        setField(term953, term953.getClass(), "region", null);
        setField(term953, term953.getClass(), "variant", null);
        setIntField(term953, term953.getClass(), "hash", 96625884);
        setField(term952, term952.getClass(), "baseLocale", term953);
        setField(term952, term952.getClass(), "localeExtensions", null);
        setIntField(term952, term952.getClass(), "hashCodeValue", 96625884);
        setField(term952, term952.getClass(), "languageTag", null);
        setField(term938, term938.getClass(), "iLocale", term952);
        setElement(term919, 1, term938);
        setField(term897, term897.getClass(), "iSavedFields", term919);
        setIntField(term897, term897.getClass(), "iSavedFieldsCount", -1968847291);
        setBooleanField(term897, term897.getClass(), "iSavedFieldsShared", true);
        setField(term897, term897.getClass(), "iSavedState", term958);
        Integer term6876 = new Integer(1227103734);
        term6865 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object term6866 = newInstance(Class.forName("java.util.Locale"));
        Object term6867 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6877 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 2);
        Object term6878 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term6881 = newInstance(Class.forName("java.util.Locale"));
        Object term6882 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6883 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        Object term6886 = newInstance(Class.forName("java.util.Locale"));
        Object term6887 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term6888 = newInstance(Class.forName("java.lang.Object"));
        setField(term6865, term6865.getClass(), "iChrono", null);
        setLongField(term6865, term6865.getClass(), "iMillis", 6967924379644551255L);
        setField(term6865, term6865.getClass(), "iZone", null);
        setIntField(term6865, term6865.getClass(), "iOffset", -157887805);
        setField(term6867, term6867.getClass(), "language", "en");
        setField(term6867, term6867.getClass(), "script", "");
        setField(term6867, term6867.getClass(), "region", "DK");
        setField(term6867, term6867.getClass(), "variant", "");
        setIntField(term6867, term6867.getClass(), "hash", 96620304);
        setField(term6866, term6866.getClass(), "baseLocale", term6867);
        setField(term6866, term6866.getClass(), "localeExtensions", null);
        setIntField(term6866, term6866.getClass(), "hashCodeValue", 96620304);
        setField(term6866, term6866.getClass(), "languageTag", null);
        setField(term6865, term6865.getClass(), "iLocale", term6866);
        setField(term6865, term6865.getClass(), "iPivotYear", term6876);
        setIntField(term6865, term6865.getClass(), "iDefaultYear", 1876565163);
        setField(term6878, term6878.getClass(), "iField", null);
        setIntField(term6878, term6878.getClass(), "iValue", -817164822);
        setField(term6878, term6878.getClass(), "iText", "eZFUvlxvGV");
        setField(term6882, term6882.getClass(), "language", null);
        setField(term6882, term6882.getClass(), "script", null);
        setField(term6882, term6882.getClass(), "region", null);
        setField(term6882, term6882.getClass(), "variant", null);
        setIntField(term6882, term6882.getClass(), "hash", 101021281);
        setField(term6881, term6881.getClass(), "baseLocale", term6882);
        setField(term6881, term6881.getClass(), "localeExtensions", null);
        setIntField(term6881, term6881.getClass(), "hashCodeValue", 101021281);
        setField(term6881, term6881.getClass(), "languageTag", null);
        setField(term6878, term6878.getClass(), "iLocale", term6881);
        setElement(term6877, 0, term6878);
        setField(term6883, term6883.getClass(), "iField", null);
        setIntField(term6883, term6883.getClass(), "iValue", -1016503459);
        setField(term6883, term6883.getClass(), "iText", "BYqFIqCKAV");
        setField(term6887, term6887.getClass(), "language", null);
        setField(term6887, term6887.getClass(), "script", null);
        setField(term6887, term6887.getClass(), "region", null);
        setField(term6887, term6887.getClass(), "variant", null);
        setIntField(term6887, term6887.getClass(), "hash", 96625884);
        setField(term6886, term6886.getClass(), "baseLocale", term6887);
        setField(term6886, term6886.getClass(), "localeExtensions", null);
        setIntField(term6886, term6886.getClass(), "hashCodeValue", 96625884);
        setField(term6886, term6886.getClass(), "languageTag", null);
        setField(term6883, term6883.getClass(), "iLocale", term6886);
        setElement(term6877, 1, term6883);
        setField(term6865, term6865.getClass(), "iSavedFields", term6877);
        setIntField(term6865, term6865.getClass(), "iSavedFieldsCount", -1968847291);
        setBooleanField(term6865, term6865.getClass(), "iSavedFieldsShared", true);
        setField(term6865, term6865.getClass(), "iSavedState", term6888);
        term6801 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPivotYear", argTypes, term897, args);
        assertTrue(recursiveEquals(term897, term6865));
        assertTrue(recursiveEquals(retValue, term6801));
    }

};


