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

public class DateTimeFormatterBuilder_isFormatter_1301817866147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716;
     Object term722;
     Object term13041;
     Object term13045;

    public DateTimeFormatterBuilder_isFormatter_1301817866147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term717 = new ArrayList();
        term716 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term721 = newInstance(Class.forName("java.lang.Object"));
        setField(term716, term716.getClass(), "iElementPairs", term717);
        setField(term716, term716.getClass(), "iFormatter", term721);
        term722 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term13042 = new ArrayList();
        term13041 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term13044 = newInstance(Class.forName("java.lang.Object"));
        setField(term13041, term13041.getClass(), "iElementPairs", term13042);
        setField(term13041, term13041.getClass(), "iFormatter", term13044);
        term13045 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term722;
        Object retValue = callMethod(klass, "isFormatter", argTypes, term716, args);
        assertTrue(recursiveEquals(term716, term13041));
        assertTrue(recursiveEquals(term722, term13045));
        assertTrue(recursiveEquals(retValue, false));
    }

};


