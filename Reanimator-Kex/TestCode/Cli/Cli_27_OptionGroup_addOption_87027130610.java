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
import java.lang.Object;
import java.util.ArrayList;

public class OptionGroup_addOption_87027130610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term20;
     Object term481;
     Object term489;
     Object term458;

    public OptionGroup_addOption_87027130610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term1, term1.getClass(), "optionMap", term2);
        setField(term1, term1.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "required", false);
        ArrayList term73 = new ArrayList();
        term20 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term72 = newInstance(Class.forName("java.lang.Object"));
        setField(term20, term20.getClass(), "opt", "sjlJAEtRrb");
        setField(term20, term20.getClass(), "longOpt", "MuLcgQHgqz");
        setField(term20, term20.getClass(), "argName", "xxtlPwDYFs");
        setField(term20, term20.getClass(), "description", "jJCZpVmanW");
        setBooleanField(term20, term20.getClass(), "required", false);
        setBooleanField(term20, term20.getClass(), "optionalArg", false);
        setIntField(term20, term20.getClass(), "numberOfArgs", 568599855);
        setField(term20, term20.getClass(), "type", term72);
        setField(term20, term20.getClass(), "values", term73);
        setCharField(term20, term20.getClass(), "valuesep", 'P');
        HashMap term482 = new HashMap();
        term481 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term481, term481.getClass(), "optionMap", term482);
        setField(term481, term481.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term481, term481.getClass(), "required", false);
        term489 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term489, term489.getClass(), "opt", null);
        setField(term489, term489.getClass(), "longOpt", null);
        setField(term489, term489.getClass(), "argName", null);
        setField(term489, term489.getClass(), "description", null);
        setBooleanField(term489, term489.getClass(), "required", false);
        setBooleanField(term489, term489.getClass(), "optionalArg", false);
        setIntField(term489, term489.getClass(), "numberOfArgs", 568599855);
        setField(term489, term489.getClass(), "type", null);
        setField(term489, term489.getClass(), "values", null);
        setCharField(term489, term489.getClass(), "valuesep", 'P');
        HashMap term459 = new HashMap();
        term458 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term458, term458.getClass(), "optionMap", term459);
        setField(term458, term458.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term458, term458.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term20;
        Object retValue = callMethod(klass, "addOption", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term481));
        assertTrue(recursiveEquals(term20, term489));
        assertTrue(recursiveEquals(retValue, term458));
    }

};


