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

public class Parser_parse_89913546314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term41;

    public Parser_parse_89913546314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term22 = new HashMap();
        HashMap term27 = new HashMap();
        ArrayList term32 = new ArrayList();
        HashMap term36 = new HashMap();
        term21 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term21, term21.getClass(), "shortOpts", term22);
        setField(term21, term21.getClass(), "longOpts", term27);
        setField(term21, term21.getClass(), "requiredOpts", term32);
        setField(term21, term21.getClass(), "optionGroups", term36);
        term41 = (Object[]) newArray("java.lang.String", 5);
        setElement(term41, 0, "PAEBtnZtTD");
        setElement(term41, 1, "sjlJAEtRrb");
        setElement(term41, 2, "MuLcgQHgqz");
        setElement(term41, 3, "xxtlPwDYFs");
        setElement(term41, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term21;
        args[1] = term41;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


