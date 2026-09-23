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
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class StringUtils_replaceEach_58681469268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2552;
     Object term2577;
     Object term2674;
     Object term2676;

    public StringUtils_replaceEach_58681469268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2552 = (Object[]) newArray("java.lang.String", 2);
        setElement(term2552, 0, "fztQhjqwdP");
        setElement(term2552, 1, "eVpkWxjuki");
        term2577 = (Object[]) newArray("java.lang.String", 8);
        setElement(term2577, 0, "SJiQaLvSKv");
        setElement(term2577, 1, "OEXDRUKcFl");
        setElement(term2577, 2, "RYdKCNNMBR");
        setElement(term2577, 3, "yGtHPyvYiQ");
        setElement(term2577, 4, "MvRIxilFMJ");
        setElement(term2577, 5, "iNwOJRBEjp");
        setElement(term2577, 6, "XylxrMBraH");
        setElement(term2577, 7, "pORebkoRdD");
        term2674 = new Boolean(true);
        term2676 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = "ZVecLZMLHF";
        args[1] = term2552;
        args[2] = term2577;
        args[3] = term2674;
        args[4] = term2676;
        try {
            callMethod(klass, "replaceEach", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


