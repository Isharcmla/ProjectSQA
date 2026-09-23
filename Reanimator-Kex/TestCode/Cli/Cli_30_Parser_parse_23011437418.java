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

public class Parser_parse_23011437418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;
     Object term397;
     Object term458;
     Object term500;

    public Parser_parse_23011437418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term378 = new HashMap();
        HashMap term383 = new HashMap();
        ArrayList term388 = new ArrayList();
        HashMap term392 = new HashMap();
        term377 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term377, term377.getClass(), "shortOpts", term378);
        setField(term377, term377.getClass(), "longOpts", term383);
        setField(term377, term377.getClass(), "requiredOpts", term388);
        setField(term377, term377.getClass(), "optionGroups", term392);
        term397 = (Object[]) newArray("java.lang.String", 5);
        setElement(term397, 0, "LQFpaHEwXR");
        setElement(term397, 1, "oVcInYnLWB");
        setElement(term397, 2, "aJlieCFVtF");
        setElement(term397, 3, "ZiaGIbnzTs");
        setElement(term397, 4, "tbcdzjIfER");
        term458 = new HashMap();
        term500 = new Boolean(false);
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
        args[0] = term377;
        args[1] = term397;
        args[2] = term458;
        args[3] = term500;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


