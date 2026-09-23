package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DateUtils_getFragmentInMilliseconds_58583481440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6980;
     Object term6982;

    public DateUtils_getFragmentInMilliseconds_58583481440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6980 = newInstance(Class.forName("java.util.Date"));
        setLongField(term6980, term6980.getClass(), "fastTime", 1630970644759L);
        setField(term6980, term6980.getClass(), "cdate", null);
        term6982 = new Integer(-226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term6980;
        args[1] = term6982;
        callMethod(klass, "getFragmentInMilliseconds", argTypes, null, args);
    }

};


