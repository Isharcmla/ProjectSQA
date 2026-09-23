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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_printHelp_115627892721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;
     Object term1116;

    public HelpFormatter_printHelp_115627892721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1063 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1091 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1063, term1063.getClass(), "defaultWidth", 74);
        setIntField(term1063, term1063.getClass(), "defaultLeftPad", 1);
        setIntField(term1063, term1063.getClass(), "defaultDescPad", 3);
        setField(term1063, term1063.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1063, term1063.getClass(), "defaultNewLine", "\n");
        setField(term1063, term1063.getClass(), "defaultOptPrefix", "-");
        setField(term1063, term1063.getClass(), "defaultLongOptPrefix", "--");
        setField(term1063, term1063.getClass(), "defaultArgName", "arg");
        setField(term1063, term1063.getClass(), "optionComparator", term1091);
        HashMap term1117 = new HashMap();
        HashMap term1122 = new HashMap();
        ArrayList term1127 = new ArrayList();
        HashMap term1131 = new HashMap();
        term1116 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1116, term1116.getClass(), "shortOpts", term1117);
        setField(term1116, term1116.getClass(), "longOpts", term1122);
        setField(term1116, term1116.getClass(), "requiredOpts", term1127);
        setField(term1116, term1116.getClass(), "optionGroups", term1131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "MjGYSRKTNF";
        args[1] = "hRNSzYYIrc";
        args[2] = term1116;
        args[3] = "RMFIsYGgne";
        callMethod(klass, "printHelp", argTypes, term1063, args);
    }

};


