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
import java.lang.Boolean;

public class HelpFormatter_printHelp_29639799122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term1245;
     Object term1277;

    public HelpFormatter_printHelp_29639799122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1192 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1220 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1192, term1192.getClass(), "defaultWidth", 74);
        setIntField(term1192, term1192.getClass(), "defaultLeftPad", 1);
        setIntField(term1192, term1192.getClass(), "defaultDescPad", 3);
        setField(term1192, term1192.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1192, term1192.getClass(), "defaultNewLine", "\n");
        setField(term1192, term1192.getClass(), "defaultOptPrefix", "-");
        setField(term1192, term1192.getClass(), "defaultLongOptPrefix", "--");
        setField(term1192, term1192.getClass(), "defaultArgName", "arg");
        setField(term1192, term1192.getClass(), "optionComparator", term1220);
        HashMap term1246 = new HashMap();
        HashMap term1251 = new HashMap();
        ArrayList term1256 = new ArrayList();
        HashMap term1260 = new HashMap();
        term1245 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1245, term1245.getClass(), "shortOpts", term1246);
        setField(term1245, term1245.getClass(), "longOpts", term1251);
        setField(term1245, term1245.getClass(), "requiredOpts", term1256);
        setField(term1245, term1245.getClass(), "optionGroups", term1260);
        term1277 = new Boolean(false);
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
        args[2] = term1245;
        args[3] = "MxlszYVzRf";
        args[4] = term1277;
        callMethod(klass, "printHelp", argTypes, term1192, args);
    }

};


