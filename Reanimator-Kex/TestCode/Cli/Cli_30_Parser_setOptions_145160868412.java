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

public class Parser_setOptions_145160868412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Parser_setOptions_145160868412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        HashMap term7 = new HashMap();
        ArrayList term12 = new ArrayList();
        HashMap term16 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1, term1.getClass(), "shortOpts", term2);
        setField(term1, term1.getClass(), "longOpts", term7);
        setField(term1, term1.getClass(), "requiredOpts", term12);
        setField(term1, term1.getClass(), "optionGroups", term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        Object[] args = new Object[1];
        args[0] = term1;
        try {
            callMethod(klass, "setOptions", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


