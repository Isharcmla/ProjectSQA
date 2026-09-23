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

public class Parser_parse_8991354638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term21;

    public Parser_parse_8991354638() {
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
        term21 = (Object[]) newArray("java.lang.String", 5);
        setElement(term21, 0, "PAEBtnZtTD");
        setElement(term21, 1, "sjlJAEtRrb");
        setElement(term21, 2, "MuLcgQHgqz");
        setElement(term21, 3, "xxtlPwDYFs");
        setElement(term21, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term21;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


