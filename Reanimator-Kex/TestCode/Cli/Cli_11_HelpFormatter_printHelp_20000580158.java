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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_printHelp_20000580158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;
     Object term932;
     Object term15580;
     Object term15594;

    public HelpFormatter_printHelp_20000580158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term919 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term891, term891.getClass(), "defaultWidth", 74);
        setIntField(term891, term891.getClass(), "defaultLeftPad", 1);
        setIntField(term891, term891.getClass(), "defaultDescPad", 3);
        setField(term891, term891.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term891, term891.getClass(), "defaultNewLine", "\n");
        setField(term891, term891.getClass(), "defaultOptPrefix", "-");
        setField(term891, term891.getClass(), "defaultLongOptPrefix", "--");
        setField(term891, term891.getClass(), "defaultArgName", "arg");
        setField(term891, term891.getClass(), "optionComparator", term919);
        HashMap term933 = new HashMap();
        HashMap term938 = new HashMap();
        ArrayList term943 = new ArrayList();
        HashMap term947 = new HashMap();
        term932 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term932, term932.getClass(), "shortOpts", term933);
        setField(term932, term932.getClass(), "longOpts", term938);
        setField(term932, term932.getClass(), "requiredOpts", term943);
        setField(term932, term932.getClass(), "optionGroups", term947);
        term15580 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term15591 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term15580, term15580.getClass(), "defaultWidth", 74);
        setIntField(term15580, term15580.getClass(), "defaultLeftPad", 1);
        setIntField(term15580, term15580.getClass(), "defaultDescPad", 3);
        setField(term15580, term15580.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term15580, term15580.getClass(), "defaultNewLine", "\n");
        setField(term15580, term15580.getClass(), "defaultOptPrefix", "-");
        setField(term15580, term15580.getClass(), "defaultLongOptPrefix", "--");
        setField(term15580, term15580.getClass(), "defaultArgName", "arg");
        setField(term15580, term15580.getClass(), "optionComparator", term15591);
        HashMap term15595 = new HashMap();
        HashMap term15597 = new HashMap();
        ArrayList term15599 = new ArrayList();
        HashMap term15601 = new HashMap();
        term15594 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term15594, term15594.getClass(), "shortOpts", term15595);
        setField(term15594, term15594.getClass(), "longOpts", term15597);
        setField(term15594, term15594.getClass(), "requiredOpts", term15599);
        setField(term15594, term15594.getClass(), "optionGroups", term15601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.cli.Options");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term932;
        callMethod(klass, "printHelp", argTypes, term891, args);
        assertTrue(recursiveEquals(term891, term15580));
        assertTrue(recursiveEquals(term932, term15594));
    }

};


