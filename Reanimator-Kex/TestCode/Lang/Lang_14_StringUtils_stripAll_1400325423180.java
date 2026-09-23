package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;

public class StringUtils_stripAll_1400325423180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term5389;
     Object term5328;

    public StringUtils_stripAll_1400325423180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = (Object[]) newArray("java.lang.String", 5);
        setElement(term265, 0, "MxlszYVzRf");
        setElement(term265, 1, "LQFpaHEwXR");
        setElement(term265, 2, "oVcInYnLWB");
        setElement(term265, 3, "aJlieCFVtF");
        setElement(term265, 4, "ZiaGIbnzTs");
        term5389 = (Object[]) newArray("java.lang.String", 5);
        setElement(term5389, 0, "MxlszYVzRf");
        setElement(term5389, 1, "LQFpaHEwXR");
        setElement(term5389, 2, "oVcInYnLWB");
        setElement(term5389, 3, "aJlieCFVtF");
        setElement(term5389, 4, "ZiaGIbnzTs");
        term5328 = (Object[]) newArray("java.lang.String", 5);
        setElement(term5328, 0, "MxlszYVzRf");
        setElement(term5328, 1, "LQFpaHEwXR");
        setElement(term5328, 2, "oVcInYnLWB");
        setElement(term5328, 3, "aJlieCFVtF");
        setElement(term5328, 4, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term265;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term265, term5389));
        assertTrue(recursiveEquals(retValue, term5328));
    }

};


