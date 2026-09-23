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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_parse_16712595069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32207;
     Object term32455;
     Object term31824;

    public DefaultParser_parse_16712595069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32389 = new ArrayList();
        term32207 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term32273 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term32337 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term32207, term32207.getClass(), "options", term32273);
        setBooleanField(term32207, term32207.getClass(), "stopAtNonOption", false);
        setBooleanField(term32207, term32207.getClass(), "skipParsing", false);
        setField(term32207, term32207.getClass(), "currentOption", term32337);
        setField(term32207, term32207.getClass(), "expectedOpts", term32389);
        setField(term32207, term32207.getClass(), "cmd", null);
        setField(term32207, term32207.getClass(), "currentToken", null);
        LinkedHashMap term32621 = new LinkedHashMap();
        term32455 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term32561 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term32455, term32455.getClass(), "requiredOpts", term32561);
        setField(term32455, term32455.getClass(), "optionGroups", term32621);
        term31824 = (Object[]) newArray("java.lang.String", 64);
        setElement(term31824, 0, "");
        setElement(term31824, 1, "");
        setElement(term31824, 2, "--");
        setElement(term31824, 3, "");
        setElement(term31824, 4, "");
        setElement(term31824, 5, "");
        setElement(term31824, 6, "");
        setElement(term31824, 7, "");
        setElement(term31824, 8, "");
        setElement(term31824, 9, "");
        setElement(term31824, 10, "");
        setElement(term31824, 11, "");
        setElement(term31824, 12, "");
        setElement(term31824, 13, "");
        setElement(term31824, 14, "");
        setElement(term31824, 15, "");
        setElement(term31824, 16, "");
        setElement(term31824, 17, "");
        setElement(term31824, 18, "");
        setElement(term31824, 19, "");
        setElement(term31824, 20, "");
        setElement(term31824, 21, "");
        setElement(term31824, 22, "");
        setElement(term31824, 23, "");
        setElement(term31824, 24, "");
        setElement(term31824, 25, "");
        setElement(term31824, 26, "");
        setElement(term31824, 27, "");
        setElement(term31824, 28, "");
        setElement(term31824, 29, "");
        setElement(term31824, 30, "");
        setElement(term31824, 31, "");
        setElement(term31824, 32, "");
        setElement(term31824, 33, "");
        setElement(term31824, 34, "");
        setElement(term31824, 35, "");
        setElement(term31824, 36, "");
        setElement(term31824, 37, "");
        setElement(term31824, 38, "");
        setElement(term31824, 39, "");
        setElement(term31824, 40, "");
        setElement(term31824, 41, "");
        setElement(term31824, 42, "");
        setElement(term31824, 43, "");
        setElement(term31824, 44, "");
        setElement(term31824, 45, "");
        setElement(term31824, 46, "");
        setElement(term31824, 47, "");
        setElement(term31824, 48, "");
        setElement(term31824, 49, "");
        setElement(term31824, 50, "");
        setElement(term31824, 51, "");
        setElement(term31824, 52, "");
        setElement(term31824, 53, "");
        setElement(term31824, 54, "");
        setElement(term31824, 55, "");
        setElement(term31824, 56, "");
        setElement(term31824, 57, "");
        setElement(term31824, 58, "");
        setElement(term31824, 59, "");
        setElement(term31824, 60, "");
        setElement(term31824, 61, "");
        setElement(term31824, 62, "");
        setElement(term31824, 63, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term32455;
        args[1] = term31824;
        try {
            callMethod(klass, "parse", argTypes, term32207, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


