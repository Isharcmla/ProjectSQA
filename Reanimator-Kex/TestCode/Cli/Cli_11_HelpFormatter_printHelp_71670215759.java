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
import java.lang.Boolean;

public class HelpFormatter_printHelp_71670215759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976;
     Object term1017;
     Object term1037;
     Object term24058;
     Object term24072;

    public HelpFormatter_printHelp_71670215759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1004 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term976, term976.getClass(), "defaultWidth", 74);
        setIntField(term976, term976.getClass(), "defaultLeftPad", 1);
        setIntField(term976, term976.getClass(), "defaultDescPad", 3);
        setField(term976, term976.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term976, term976.getClass(), "defaultNewLine", "\n");
        setField(term976, term976.getClass(), "defaultOptPrefix", "-");
        setField(term976, term976.getClass(), "defaultLongOptPrefix", "--");
        setField(term976, term976.getClass(), "defaultArgName", "arg");
        setField(term976, term976.getClass(), "optionComparator", term1004);
        HashMap term1018 = new HashMap();
        HashMap term1023 = new HashMap();
        ArrayList term1028 = new ArrayList();
        HashMap term1032 = new HashMap();
        term1017 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1017, term1017.getClass(), "shortOpts", term1018);
        setField(term1017, term1017.getClass(), "longOpts", term1023);
        setField(term1017, term1017.getClass(), "requiredOpts", term1028);
        setField(term1017, term1017.getClass(), "optionGroups", term1032);
        term1037 = new Boolean(false);
        term24058 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term24069 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term24058, term24058.getClass(), "defaultWidth", 74);
        setIntField(term24058, term24058.getClass(), "defaultLeftPad", 1);
        setIntField(term24058, term24058.getClass(), "defaultDescPad", 3);
        setField(term24058, term24058.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term24058, term24058.getClass(), "defaultNewLine", "\n");
        setField(term24058, term24058.getClass(), "defaultOptPrefix", "-");
        setField(term24058, term24058.getClass(), "defaultLongOptPrefix", "--");
        setField(term24058, term24058.getClass(), "defaultArgName", "arg");
        setField(term24058, term24058.getClass(), "optionComparator", term24069);
        HashMap term24073 = new HashMap();
        HashMap term24075 = new HashMap();
        ArrayList term24077 = new ArrayList();
        HashMap term24079 = new HashMap();
        term24072 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term24072, term24072.getClass(), "shortOpts", term24073);
        setField(term24072, term24072.getClass(), "longOpts", term24075);
        setField(term24072, term24072.getClass(), "requiredOpts", term24077);
        setField(term24072, term24072.getClass(), "optionGroups", term24079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.cli.Options");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "SzjVpOQTyS";
        args[1] = term1017;
        args[2] = term1037;
        callMethod(klass, "printHelp", argTypes, term976, args);
        assertTrue(recursiveEquals(term976, term24058));
        assertTrue(recursiveEquals(term1017, term24072));
        assertTrue(recursiveEquals(term1037, false));
    }

};


