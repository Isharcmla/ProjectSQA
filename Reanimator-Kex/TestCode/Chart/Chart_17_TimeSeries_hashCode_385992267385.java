package org.jfree.data.time;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class TimeSeries_hashCode_385992267385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158191;

    public TimeSeries_hashCode_385992267385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158301 = Class.forName((String) "java.util.stream.WhileOps$UnorderedWhileSpliterator$OfLong$Dropping");
        ArrayList term158353 = new ArrayList();
        term158191 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term158265 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferL"));
        setField(term158191, term158191.getClass(), "key", term158265);
        setField(term158191, term158191.getClass(), "description", null);
        setField(term158191, term158191.getClass(), "domain", null);
        setField(term158191, term158191.getClass(), "range", null);
        setField(term158191, term158191.getClass(), "timePeriodClass", term158301);
        setField(term158191, term158191.getClass(), "data", term158353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term158191, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


