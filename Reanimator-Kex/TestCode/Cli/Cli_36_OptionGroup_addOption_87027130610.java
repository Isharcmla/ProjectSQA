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
import java.util.ArrayList;

public class OptionGroup_addOption_87027130610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term20;
     Object term677;
     Object term685;
     Object term654;

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
        ArrayList term72 = new ArrayList();
        ((ArrayList) term72).add("EGtDIRbSSb");
        ((ArrayList) term72).add("SzjVpOQTyS");
        ((ArrayList) term72).add("MjGYSRKTNF");
        ((ArrayList) term72).add("hRNSzYYIrc");
        ((ArrayList) term72).add("RMFIsYGgne");
        term20 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term20, term20.getClass(), "opt", "sjlJAEtRrb");
        setField(term20, term20.getClass(), "longOpt", "MuLcgQHgqz");
        setField(term20, term20.getClass(), "argName", "xxtlPwDYFs");
        setField(term20, term20.getClass(), "description", "jJCZpVmanW");
        setBooleanField(term20, term20.getClass(), "required", false);
        setBooleanField(term20, term20.getClass(), "optionalArg", false);
        setIntField(term20, term20.getClass(), "numberOfArgs", 568599855);
        setField(term20, term20.getClass(), "type", null);
        setField(term20, term20.getClass(), "values", term72);
        setCharField(term20, term20.getClass(), "valuesep", 'P');
        HashMap term678 = new HashMap();
        term677 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term677, term677.getClass(), "optionMap", term678);
        setField(term677, term677.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term677, term677.getClass(), "required", false);
        term685 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term685, term685.getClass(), "opt", null);
        setField(term685, term685.getClass(), "longOpt", null);
        setField(term685, term685.getClass(), "argName", null);
        setField(term685, term685.getClass(), "description", null);
        setBooleanField(term685, term685.getClass(), "required", false);
        setBooleanField(term685, term685.getClass(), "optionalArg", false);
        setIntField(term685, term685.getClass(), "numberOfArgs", 568599855);
        setField(term685, term685.getClass(), "type", null);
        setField(term685, term685.getClass(), "values", null);
        setCharField(term685, term685.getClass(), "valuesep", 'P');
        HashMap term655 = new HashMap();
        term654 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term654, term654.getClass(), "optionMap", term655);
        setField(term654, term654.getClass(), "selected", "PAEBtnZtTD");
        setBooleanField(term654, term654.getClass(), "required", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term20;
        Object retValue = callMethod(klass, "addOption", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term677));
        assertTrue(recursiveEquals(term20, term685));
        assertTrue(recursiveEquals(retValue, term654));
    }

};


