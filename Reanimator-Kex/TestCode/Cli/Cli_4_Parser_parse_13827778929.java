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

public class Parser_parse_13827778929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term152;
     Object term201;

    public Parser_parse_13827778929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term133 = new HashMap();
        HashMap term138 = new HashMap();
        ArrayList term143 = new ArrayList();
        HashMap term147 = new HashMap();
        term132 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term132, term132.getClass(), "shortOpts", term133);
        setField(term132, term132.getClass(), "longOpts", term138);
        setField(term132, term132.getClass(), "requiredOpts", term143);
        setField(term132, term132.getClass(), "optionGroups", term147);
        term152 = (Object[]) newArray("java.lang.String", 4);
        setElement(term152, 0, "EGtDIRbSSb");
        setElement(term152, 1, "SzjVpOQTyS");
        setElement(term152, 2, "MjGYSRKTNF");
        setElement(term152, 3, "hRNSzYYIrc");
        term201 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Properties");
        Object[] args = new Object[3];
        args[0] = term132;
        args[1] = term152;
        args[2] = term201;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


