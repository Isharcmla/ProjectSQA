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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.util.HashMap;

public class OptionGroup_addOption_87027130636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5555;
     Object term5667;
     Object term6797;
     Object term6802;
     Object term6787;

    public OptionGroup_addOption_87027130636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5603 = new HashMap();
        term5555 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term5555, term5555.getClass(), "optionMap", term5603);
        term5667 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5667, term5667.getClass(), "opt", null);
        setField(term5667, term5667.getClass(), "longOpt", null);
        HashMap term6798 = new HashMap();
        term6797 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term6797, term6797.getClass(), "optionMap", term6798);
        setField(term6797, term6797.getClass(), "selected", null);
        setBooleanField(term6797, term6797.getClass(), "required", false);
        term6802 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6802, term6802.getClass(), "opt", null);
        setField(term6802, term6802.getClass(), "longOpt", null);
        setField(term6802, term6802.getClass(), "argName", null);
        setField(term6802, term6802.getClass(), "description", null);
        setBooleanField(term6802, term6802.getClass(), "required", false);
        setBooleanField(term6802, term6802.getClass(), "optionalArg", false);
        setIntField(term6802, term6802.getClass(), "numberOfArgs", 0);
        setField(term6802, term6802.getClass(), "type", null);
        setField(term6802, term6802.getClass(), "values", null);
        setCharField(term6802, term6802.getClass(), "valuesep", (char) 0);
        HashMap term6788 = new HashMap();
        term6787 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term6787, term6787.getClass(), "optionMap", term6788);
        setField(term6787, term6787.getClass(), "selected", null);
        setBooleanField(term6787, term6787.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term5667;
        Object retValue = callMethod(klass, "addOption", argTypes, term5555, args);
        assertTrue(recursiveEquals(term5555, term6797));
        assertTrue(recursiveEquals(term5667, term6802));
        assertTrue(recursiveEquals(retValue, term6787));
    }

};


