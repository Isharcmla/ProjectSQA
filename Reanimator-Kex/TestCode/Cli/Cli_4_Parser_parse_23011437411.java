package org.apache.commons.cli;

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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Parser_parse_23011437411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357;
     Object term377;
     Object term438;
     Object term478;

    public Parser_parse_23011437411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term358 = new HashMap();
        HashMap term363 = new HashMap();
        ArrayList term368 = new ArrayList();
        HashMap term372 = new HashMap();
        term357 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term357, term357.getClass(), "shortOpts", term358);
        setField(term357, term357.getClass(), "longOpts", term363);
        setField(term357, term357.getClass(), "requiredOpts", term368);
        setField(term357, term357.getClass(), "optionGroups", term372);
        term377 = (Object[]) newArray("java.lang.String", 5);
        setElement(term377, 0, "LQFpaHEwXR");
        setElement(term377, 1, "oVcInYnLWB");
        setElement(term377, 2, "aJlieCFVtF");
        setElement(term377, 3, "ZiaGIbnzTs");
        setElement(term377, 4, "tbcdzjIfER");
        term438 = new HashMap();
        term478 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Properties");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term357;
        args[1] = term377;
        args[2] = term438;
        args[3] = term478;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


