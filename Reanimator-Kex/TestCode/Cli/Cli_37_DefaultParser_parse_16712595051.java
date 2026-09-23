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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.LinkedList;

public class DefaultParser_parse_16712595051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18634;
     Object term18738;
     Object term18386;
     Object term18994;
     Object term19011;
     Object term19016;
     Object term18944;

    public DefaultParser_parse_16712595051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18634 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term18634, term18634.getClass(), "options", null);
        setBooleanField(term18634, term18634.getClass(), "stopAtNonOption", false);
        setBooleanField(term18634, term18634.getClass(), "skipParsing", false);
        setField(term18634, term18634.getClass(), "currentOption", null);
        setField(term18634, term18634.getClass(), "expectedOpts", null);
        setField(term18634, term18634.getClass(), "cmd", null);
        setField(term18634, term18634.getClass(), "currentToken", "");
        ArrayList term18790 = new ArrayList();
        LinkedHashMap term18850 = new LinkedHashMap();
        term18738 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18738, term18738.getClass(), "requiredOpts", term18790);
        setField(term18738, term18738.getClass(), "optionGroups", term18850);
        term18386 = (Object[]) newArray("java.lang.String", 1);
        setElement(term18386, 0, "");
        LinkedList term18996 = new LinkedList();
        ((LinkedList) term18996).add("");
        ArrayList term19000 = new ArrayList();
        ArrayList term19003 = new ArrayList();
        LinkedHashMap term19005 = new LinkedHashMap();
        ArrayList term19009 = new ArrayList();
        term18994 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term18995 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term19002 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18995, term18995.getClass(), "args", term18996);
        setField(term18995, term18995.getClass(), "options", term19000);
        setField(term18994, term18994.getClass(), "cmd", term18995);
        setField(term19002, term19002.getClass(), "shortOpts", null);
        setField(term19002, term19002.getClass(), "longOpts", null);
        setField(term19002, term19002.getClass(), "requiredOpts", term19003);
        setField(term19002, term19002.getClass(), "optionGroups", term19005);
        setField(term18994, term18994.getClass(), "options", term19002);
        setBooleanField(term18994, term18994.getClass(), "stopAtNonOption", false);
        setField(term18994, term18994.getClass(), "currentToken", "");
        setField(term18994, term18994.getClass(), "currentOption", null);
        setBooleanField(term18994, term18994.getClass(), "skipParsing", false);
        setField(term18994, term18994.getClass(), "expectedOpts", term19009);
        ArrayList term19012 = new ArrayList();
        LinkedHashMap term19014 = new LinkedHashMap();
        term19011 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19011, term19011.getClass(), "shortOpts", null);
        setField(term19011, term19011.getClass(), "longOpts", null);
        setField(term19011, term19011.getClass(), "requiredOpts", term19012);
        setField(term19011, term19011.getClass(), "optionGroups", term19014);
        term19016 = (Object[]) newArray("java.lang.String", 1);
        setElement(term19016, 0, "");
        LinkedList term18945 = new LinkedList();
        ((LinkedList) term18945).add("");
        ArrayList term18951 = new ArrayList();
        term18944 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term18944, term18944.getClass(), "args", term18945);
        setField(term18944, term18944.getClass(), "options", term18951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term18738;
        args[1] = term18386;
        Object retValue = callMethod(klass, "parse", argTypes, term18634, args);
        assertTrue(recursiveEquals(term18634, term18994));
        assertTrue(recursiveEquals(term18738, term19011));
        assertTrue(recursiveEquals(term18386, term19016));
        assertTrue(recursiveEquals(retValue, term18944));
    }

};


