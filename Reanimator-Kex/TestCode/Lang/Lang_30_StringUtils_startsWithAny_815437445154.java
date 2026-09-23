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

public class StringUtils_startsWithAny_815437445154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5196;

    public StringUtils_startsWithAny_815437445154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5196 = (Object[]) newArray("java.lang.String", 9);
        setElement(term5196, 0, "qCpEbQDHdF");
        setElement(term5196, 1, "AHbZyFOmlo");
        setElement(term5196, 2, "TwfWVQGiIj");
        setElement(term5196, 3, "gUvcueTURF");
        setElement(term5196, 4, "EwQBhZjCIT");
        setElement(term5196, 5, "aSkmSwTnEw");
        setElement(term5196, 6, "xvkbvaEGYd");
        setElement(term5196, 7, "HBGNxdNURv");
        setElement(term5196, 8, "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "NzBMMhkhpT";
        args[1] = term5196;
        callMethod(klass, "startsWithAny", argTypes, null, args);
    }

};


