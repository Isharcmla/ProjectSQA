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

public class Parser_parse_138277789215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;
     Object term172;
     Object term221;

    public Parser_parse_138277789215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term153 = new HashMap();
        HashMap term158 = new HashMap();
        ArrayList term163 = new ArrayList();
        HashMap term167 = new HashMap();
        term152 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term152, term152.getClass(), "shortOpts", term153);
        setField(term152, term152.getClass(), "longOpts", term158);
        setField(term152, term152.getClass(), "requiredOpts", term163);
        setField(term152, term152.getClass(), "optionGroups", term167);
        term172 = (Object[]) newArray("java.lang.String", 4);
        setElement(term172, 0, "EGtDIRbSSb");
        setElement(term172, 1, "SzjVpOQTyS");
        setElement(term172, 2, "MjGYSRKTNF");
        setElement(term172, 3, "hRNSzYYIrc");
        term221 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Properties");
        Object[] args = new Object[3];
        args[0] = term152;
        args[1] = term172;
        args[2] = term221;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


