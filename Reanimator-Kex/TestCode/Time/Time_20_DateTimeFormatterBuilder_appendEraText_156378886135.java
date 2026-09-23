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
import java.util.ArrayList;
import java.lang.Object;

public class DateTimeFormatterBuilder_appendEraText_156378886135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500;
     Object term11282;
     Object term11266;

    public DateTimeFormatterBuilder_appendEraText_156378886135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term501 = new ArrayList();
        term500 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term505 = newInstance(Class.forName("java.lang.Object"));
        setField(term500, term500.getClass(), "iElementPairs", term501);
        setField(term500, term500.getClass(), "iFormatter", term505);
        Object term11285 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11286 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11286, term11286.getClass(), "iOrdinal", (byte) 1);
        setField(term11286, term11286.getClass(), "iUnitType", null);
        setField(term11286, term11286.getClass(), "iRangeType", null);
        setField(term11286, term11286.getClass(), "iName", null);
        setField(term11285, term11285.getClass(), "iFieldType", term11286);
        setBooleanField(term11285, term11285.getClass(), "iShort", false);
        ArrayList term11283 = new ArrayList();
        ((ArrayList) term11283).add(term11285);
        ((ArrayList) term11283).add(term11285);
        term11282 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11282, term11282.getClass(), "iElementPairs", term11283);
        setField(term11282, term11282.getClass(), "iFormatter", null);
        Object term11269 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        Object term11270 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setByteField(term11270, term11270.getClass(), "iOrdinal", (byte) 1);
        setField(term11270, term11270.getClass(), "iUnitType", null);
        setField(term11270, term11270.getClass(), "iRangeType", null);
        setField(term11270, term11270.getClass(), "iName", null);
        setField(term11269, term11269.getClass(), "iFieldType", term11270);
        setBooleanField(term11269, term11269.getClass(), "iShort", false);
        ArrayList term11267 = new ArrayList();
        ((ArrayList) term11267).add(term11269);
        ((ArrayList) term11267).add(term11269);
        term11266 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11266, term11266.getClass(), "iElementPairs", term11267);
        setField(term11266, term11266.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendEraText", argTypes, term500, args);
        assertTrue(recursiveEquals(term500, term11282));
        assertTrue(recursiveEquals(retValue, term11266));
    }

};


