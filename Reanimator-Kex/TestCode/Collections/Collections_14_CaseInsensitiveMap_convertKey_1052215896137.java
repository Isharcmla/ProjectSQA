package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class CaseInsensitiveMap_convertKey_1052215896137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25076;
     Object term25194;
     Object term25237;
     Object term25239;
     Object term25240;

    public CaseInsensitiveMap_convertKey_1052215896137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25076 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        term25194 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        term25237 = newInstance(Class.forName("org.apache.commons.collections.buffer.BoundedFifoBuffer$1"));
        Object term25238 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setIntField(term25237, term25237.getClass(), "index", 0);
        setIntField(term25237, term25237.getClass(), "lastReturnedIndex", -1);
        setBooleanField(term25237, term25237.getClass(), "isFirst", false);
        setField(term25238, term25238.getClass(), "elements", null);
        setIntField(term25238, term25238.getClass(), "start", 0);
        setIntField(term25238, term25238.getClass(), "end", 0);
        setBooleanField(term25238, term25238.getClass(), "full", false);
        setIntField(term25238, term25238.getClass(), "maxElements", 0);
        setField(term25237, term25237.getClass(), "this$0", term25238);
        term25239 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setField(term25239, term25239.getClass(), "elements", null);
        setIntField(term25239, term25239.getClass(), "start", 0);
        setIntField(term25239, term25239.getClass(), "end", 0);
        setBooleanField(term25239, term25239.getClass(), "full", false);
        setIntField(term25239, term25239.getClass(), "maxElements", 0);
        term25240 = newInstance(Class.forName("org.apache.commons.collections.buffer.CircularFifoBuffer"));
        setField(term25240, term25240.getClass(), "elements", null);
        setIntField(term25240, term25240.getClass(), "start", 0);
        setIntField(term25240, term25240.getClass(), "end", 0);
        setBooleanField(term25240, term25240.getClass(), "full", false);
        setIntField(term25240, term25240.getClass(), "maxElements", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25194;
        Object retValue = callMethod(klass, "convertKey", argTypes, term25076, args);
        assertTrue(recursiveEquals(term25076, term25237));
        assertTrue(recursiveEquals(term25194, term25239));
        assertTrue(recursiveEquals(retValue, "[]"));
    }

};


