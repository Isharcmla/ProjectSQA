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

public class HelpFormatter_printHelp_71670215763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1168;
     Object term1212;
     Object term1232;
     Object term24701;
     Object term24717;

    public HelpFormatter_printHelp_71670215763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1168 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1199 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1168, term1168.getClass(), "defaultWidth", 74);
        setIntField(term1168, term1168.getClass(), "defaultLeftPad", 1);
        setIntField(term1168, term1168.getClass(), "defaultDescPad", 3);
        setField(term1168, term1168.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1168, term1168.getClass(), "defaultNewLine", "\n");
        setField(term1168, term1168.getClass(), "defaultOptPrefix", "-");
        setField(term1168, term1168.getClass(), "defaultLongOptPrefix", "--");
        setField(term1168, term1168.getClass(), "longOptSeparator", " ");
        setField(term1168, term1168.getClass(), "defaultArgName", "arg");
        setField(term1168, term1168.getClass(), "optionComparator", term1199);
        HashMap term1213 = new HashMap();
        HashMap term1218 = new HashMap();
        ArrayList term1223 = new ArrayList();
        HashMap term1227 = new HashMap();
        term1212 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1212, term1212.getClass(), "shortOpts", term1213);
        setField(term1212, term1212.getClass(), "longOpts", term1218);
        setField(term1212, term1212.getClass(), "requiredOpts", term1223);
        setField(term1212, term1212.getClass(), "optionGroups", term1227);
        term1232 = new Boolean(false);
        term24701 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term24714 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term24701, term24701.getClass(), "defaultWidth", 74);
        setIntField(term24701, term24701.getClass(), "defaultLeftPad", 1);
        setIntField(term24701, term24701.getClass(), "defaultDescPad", 3);
        setField(term24701, term24701.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term24701, term24701.getClass(), "defaultNewLine", "\n");
        setField(term24701, term24701.getClass(), "defaultOptPrefix", "-");
        setField(term24701, term24701.getClass(), "defaultLongOptPrefix", "--");
        setField(term24701, term24701.getClass(), "longOptSeparator", " ");
        setField(term24701, term24701.getClass(), "defaultArgName", "arg");
        setField(term24701, term24701.getClass(), "optionComparator", term24714);
        HashMap term24718 = new HashMap();
        HashMap term24720 = new HashMap();
        ArrayList term24721 = new ArrayList();
        HashMap term24723 = new HashMap();
        term24717 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term24717, term24717.getClass(), "shortOpts", term24718);
        setField(term24717, term24717.getClass(), "longOpts", term24720);
        setField(term24717, term24717.getClass(), "requiredOpts", term24721);
        setField(term24717, term24717.getClass(), "optionGroups", term24723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.apache.commons.cli.Options");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "MjGYSRKTNF";
        args[1] = term1212;
        args[2] = term1232;
        callMethod(klass, "printHelp", argTypes, term1168, args);
        assertTrue(recursiveEquals(term1168, term24701));
        assertTrue(recursiveEquals(term1212, term24717));
        assertTrue(recursiveEquals(term1232, false));
    }

};


