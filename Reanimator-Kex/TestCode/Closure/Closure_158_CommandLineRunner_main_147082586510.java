package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CommandLineRunner_main_147082586510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16099;

    public CommandLineRunner_main_147082586510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16099 = (Object[]) newArray("java.lang.String", 8);
        setElement(term16099, 0, "IDCWpPLRkE");
        setElement(term16099, 1, "nyiiPDVjAc");
        setElement(term16099, 2, "aKnKipADSo");
        setElement(term16099, 3, "wSQxaModmm");
        setElement(term16099, 4, "UlajhuVLaP");
        setElement(term16099, 5, "gGSMzuGICf");
        setElement(term16099, 6, "hxCBltsObl");
        setElement(term16099, 7, "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16099;
        callMethod(klass, "main", argTypes, null, args);
    }

};


