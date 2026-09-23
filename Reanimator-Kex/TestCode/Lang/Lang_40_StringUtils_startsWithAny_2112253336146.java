package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtils_startsWithAny_2112253336146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5538;

    public StringUtils_startsWithAny_2112253336146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5538 = (Object[]) newArray("java.lang.String", 9);
        setElement(term5538, 0, "nghfqDXyCG");
        setElement(term5538, 1, "WBAOTqErtm");
        setElement(term5538, 2, "PqtVXXZMqK");
        setElement(term5538, 3, "rYbtIDVdnd");
        setElement(term5538, 4, "UKAReurpHG");
        setElement(term5538, 5, "WVRMUmrljA");
        setElement(term5538, 6, "NTlKJDDWlk");
        setElement(term5538, 7, "vOuMEpOQAg");
        setElement(term5538, 8, "SIODFGaQhr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "iIRsCSYqXH";
        args[1] = term5538;
        callMethod(klass, "startsWithAny", argTypes, null, args);
    }

};


