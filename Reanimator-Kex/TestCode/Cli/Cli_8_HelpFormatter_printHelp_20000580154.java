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

public class HelpFormatter_printHelp_20000580154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789;
     Object term829;
     Object term15241;
     Object term15254;

    public HelpFormatter_printHelp_20000580154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term789, term789.getClass(), "defaultWidth", 74);
        setIntField(term789, term789.getClass(), "defaultLeftPad", 1);
        setIntField(term789, term789.getClass(), "defaultDescPad", 3);
        setField(term789, term789.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term789, term789.getClass(), "defaultNewLine", "\n");
        setField(term789, term789.getClass(), "defaultOptPrefix", "-");
        setField(term789, term789.getClass(), "defaultLongOptPrefix", "--");
        setField(term789, term789.getClass(), "defaultArgName", "arg");
        HashMap term830 = new HashMap();
        HashMap term835 = new HashMap();
        ArrayList term840 = new ArrayList();
        HashMap term844 = new HashMap();
        term829 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term829, term829.getClass(), "shortOpts", term830);
        setField(term829, term829.getClass(), "longOpts", term835);
        setField(term829, term829.getClass(), "requiredOpts", term840);
        setField(term829, term829.getClass(), "optionGroups", term844);
        term15241 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term15241, term15241.getClass(), "defaultWidth", 74);
        setIntField(term15241, term15241.getClass(), "defaultLeftPad", 1);
        setIntField(term15241, term15241.getClass(), "defaultDescPad", 3);
        setField(term15241, term15241.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term15241, term15241.getClass(), "defaultNewLine", "\n");
        setField(term15241, term15241.getClass(), "defaultOptPrefix", "-");
        setField(term15241, term15241.getClass(), "defaultLongOptPrefix", "--");
        setField(term15241, term15241.getClass(), "defaultArgName", "arg");
        HashMap term15255 = new HashMap();
        HashMap term15257 = new HashMap();
        ArrayList term15259 = new ArrayList();
        HashMap term15261 = new HashMap();
        term15254 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term15254, term15254.getClass(), "shortOpts", term15255);
        setField(term15254, term15254.getClass(), "longOpts", term15257);
        setField(term15254, term15254.getClass(), "requiredOpts", term15259);
        setField(term15254, term15254.getClass(), "optionGroups", term15261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.cli.Options");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term829;
        callMethod(klass, "printHelp", argTypes, term789, args);
        assertTrue(recursiveEquals(term789, term15241));
        assertTrue(recursiveEquals(term829, term15254));
    }

};


