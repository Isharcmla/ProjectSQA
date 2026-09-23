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
import java.lang.Boolean;

public class HelpFormatter_printHelp_29639799120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1087;
     Object term1139;
     Object term1171;

    public HelpFormatter_printHelp_29639799120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1087 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term1087, term1087.getClass(), "defaultWidth", 74);
        setIntField(term1087, term1087.getClass(), "defaultLeftPad", 1);
        setIntField(term1087, term1087.getClass(), "defaultDescPad", 3);
        setField(term1087, term1087.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1087, term1087.getClass(), "defaultNewLine", "\n");
        setField(term1087, term1087.getClass(), "defaultOptPrefix", "-");
        setField(term1087, term1087.getClass(), "defaultLongOptPrefix", "--");
        setField(term1087, term1087.getClass(), "defaultArgName", "arg");
        HashMap term1140 = new HashMap();
        HashMap term1145 = new HashMap();
        ArrayList term1150 = new ArrayList();
        HashMap term1154 = new HashMap();
        term1139 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1139, term1139.getClass(), "shortOpts", term1140);
        setField(term1139, term1139.getClass(), "longOpts", term1145);
        setField(term1139, term1139.getClass(), "requiredOpts", term1150);
        setField(term1139, term1139.getClass(), "optionGroups", term1154);
        term1171 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = "NRdvgJlhkX";
        args[1] = "uuaPigETmJ";
        args[2] = term1139;
        args[3] = "MxlszYVzRf";
        args[4] = term1171;
        callMethod(klass, "printHelp", argTypes, term1087, args);
    }

};


