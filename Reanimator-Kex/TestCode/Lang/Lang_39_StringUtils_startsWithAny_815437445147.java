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

public class StringUtils_startsWithAny_815437445147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5580;

    public StringUtils_startsWithAny_815437445147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5580 = (Object[]) newArray("java.lang.String", 9);
        setElement(term5580, 0, "PqtVXXZMqK");
        setElement(term5580, 1, "rYbtIDVdnd");
        setElement(term5580, 2, "UKAReurpHG");
        setElement(term5580, 3, "WVRMUmrljA");
        setElement(term5580, 4, "NTlKJDDWlk");
        setElement(term5580, 5, "vOuMEpOQAg");
        setElement(term5580, 6, "SIODFGaQhr");
        setElement(term5580, 7, "qYzsiuXOgS");
        setElement(term5580, 8, "bxrCBbrrct");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "WBAOTqErtm";
        args[1] = term5580;
        callMethod(klass, "startsWithAny", argTypes, null, args);
    }

};


