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

public class StringUtils_stripAll_1400325423179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term5361;
     Object term5300;

    public StringUtils_stripAll_1400325423179() {
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
        term5361 = (Object[]) newArray("java.lang.String", 5);
        setElement(term5361, 0, "MxlszYVzRf");
        setElement(term5361, 1, "LQFpaHEwXR");
        setElement(term5361, 2, "oVcInYnLWB");
        setElement(term5361, 3, "aJlieCFVtF");
        setElement(term5361, 4, "ZiaGIbnzTs");
        term5300 = (Object[]) newArray("java.lang.String", 5);
        setElement(term5300, 0, "MxlszYVzRf");
        setElement(term5300, 1, "LQFpaHEwXR");
        setElement(term5300, 2, "oVcInYnLWB");
        setElement(term5300, 3, "aJlieCFVtF");
        setElement(term5300, 4, "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term265;
        Object retValue = callMethod(klass, "stripAll", argTypes, null, args);
        assertTrue(recursiveEquals(term265, term5361));
        assertTrue(recursiveEquals(retValue, term5300));
    }

};


