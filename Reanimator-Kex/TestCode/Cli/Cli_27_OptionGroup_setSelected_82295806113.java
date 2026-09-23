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
import org.apache.commons.cli.AlreadySelectedException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class OptionGroup_setSelected_82295806113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term205;

    public OptionGroup_setSelected_82295806113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term187 = new HashMap();
        term186 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term186, term186.getClass(), "optionMap", term187);
        setField(term186, term186.getClass(), "selected", "MjGYSRKTNF");
        setBooleanField(term186, term186.getClass(), "required", true);
        ArrayList term258 = new ArrayList();
        term205 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term257 = newInstance(Class.forName("java.lang.Object"));
        setField(term205, term205.getClass(), "opt", "hRNSzYYIrc");
        setField(term205, term205.getClass(), "longOpt", "RMFIsYGgne");
        setField(term205, term205.getClass(), "argName", "NRdvgJlhkX");
        setField(term205, term205.getClass(), "description", "uuaPigETmJ");
        setBooleanField(term205, term205.getClass(), "required", true);
        setBooleanField(term205, term205.getClass(), "optionalArg", true);
        setIntField(term205, term205.getClass(), "numberOfArgs", 1162663216);
        setField(term205, term205.getClass(), "type", term257);
        setField(term205, term205.getClass(), "values", term258);
        setCharField(term205, term205.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term205;
        try {
            callMethod(klass, "setSelected", argTypes, term186, args);
            assertTrue(false);
        }
        catch (AlreadySelectedException e) {
        }

    }

};


