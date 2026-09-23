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
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_printHelp_115627892719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;
     Object term1011;

    public HelpFormatter_printHelp_115627892719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term959 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term959, term959.getClass(), "defaultWidth", 74);
        setIntField(term959, term959.getClass(), "defaultLeftPad", 1);
        setIntField(term959, term959.getClass(), "defaultDescPad", 3);
        setField(term959, term959.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term959, term959.getClass(), "defaultNewLine", "\n");
        setField(term959, term959.getClass(), "defaultOptPrefix", "-");
        setField(term959, term959.getClass(), "defaultLongOptPrefix", "--");
        setField(term959, term959.getClass(), "defaultArgName", "arg");
        HashMap term1012 = new HashMap();
        HashMap term1017 = new HashMap();
        ArrayList term1022 = new ArrayList();
        HashMap term1026 = new HashMap();
        term1011 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1011, term1011.getClass(), "shortOpts", term1012);
        setField(term1011, term1011.getClass(), "longOpts", term1017);
        setField(term1011, term1011.getClass(), "requiredOpts", term1022);
        setField(term1011, term1011.getClass(), "optionGroups", term1026);
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
        args[2] = term1011;
        args[3] = "RMFIsYGgne";
        callMethod(klass, "printHelp", argTypes, term959, args);
    }

};


