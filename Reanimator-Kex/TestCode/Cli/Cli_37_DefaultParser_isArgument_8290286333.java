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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_isArgument_8290286333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1902;
     Object term8682;

    public DefaultParser_isArgument_8290286333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1904 = new LinkedList();
        ArrayList term1907 = new ArrayList();
        LinkedHashMap term1912 = new LinkedHashMap();
        LinkedHashMap term1918 = new LinkedHashMap();
        ArrayList term1924 = new ArrayList();
        LinkedHashMap term1928 = new LinkedHashMap();
        ArrayList term1999 = new ArrayList();
        ((ArrayList) term1999).add("");
        ArrayList term2006 = new ArrayList();
        term1902 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1903 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1911 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1947 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1903, term1903.getClass(), "args", term1904);
        setField(term1903, term1903.getClass(), "options", term1907);
        setField(term1902, term1902.getClass(), "cmd", term1903);
        setField(term1911, term1911.getClass(), "shortOpts", term1912);
        setField(term1911, term1911.getClass(), "longOpts", term1918);
        setField(term1911, term1911.getClass(), "requiredOpts", term1924);
        setField(term1911, term1911.getClass(), "optionGroups", term1928);
        setField(term1902, term1902.getClass(), "options", term1911);
        setBooleanField(term1902, term1902.getClass(), "stopAtNonOption", false);
        setField(term1902, term1902.getClass(), "currentToken", "cAPeiZHKGJ");
        setField(term1947, term1947.getClass(), "opt", "LvJFtLBaxj");
        setField(term1947, term1947.getClass(), "longOpt", "PHvxnGHptP");
        setField(term1947, term1947.getClass(), "argName", "TimdotUuNC");
        setField(term1947, term1947.getClass(), "description", "PkWMRdJcBb");
        setBooleanField(term1947, term1947.getClass(), "required", true);
        setBooleanField(term1947, term1947.getClass(), "optionalArg", true);
        setIntField(term1947, term1947.getClass(), "numberOfArgs", 1227103734);
        setField(term1947, term1947.getClass(), "type", null);
        setField(term1947, term1947.getClass(), "values", term1999);
        setCharField(term1947, term1947.getClass(), "valuesep", 'T');
        setField(term1902, term1902.getClass(), "currentOption", term1947);
        setBooleanField(term1902, term1902.getClass(), "skipParsing", true);
        setField(term1902, term1902.getClass(), "expectedOpts", term2006);
        LinkedList term8684 = new LinkedList();
        ArrayList term8685 = new ArrayList();
        LinkedHashMap term8688 = new LinkedHashMap();
        LinkedHashMap term8689 = new LinkedHashMap();
        ArrayList term8690 = new ArrayList();
        LinkedHashMap term8692 = new LinkedHashMap();
        ArrayList term8704 = new ArrayList();
        ((ArrayList) term8704).add("");
        ArrayList term8707 = new ArrayList();
        term8682 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term8683 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term8687 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term8695 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8683, term8683.getClass(), "args", term8684);
        setField(term8683, term8683.getClass(), "options", term8685);
        setField(term8682, term8682.getClass(), "cmd", term8683);
        setField(term8687, term8687.getClass(), "shortOpts", term8688);
        setField(term8687, term8687.getClass(), "longOpts", term8689);
        setField(term8687, term8687.getClass(), "requiredOpts", term8690);
        setField(term8687, term8687.getClass(), "optionGroups", term8692);
        setField(term8682, term8682.getClass(), "options", term8687);
        setBooleanField(term8682, term8682.getClass(), "stopAtNonOption", false);
        setField(term8682, term8682.getClass(), "currentToken", "cAPeiZHKGJ");
        setField(term8695, term8695.getClass(), "opt", "LvJFtLBaxj");
        setField(term8695, term8695.getClass(), "longOpt", "PHvxnGHptP");
        setField(term8695, term8695.getClass(), "argName", "TimdotUuNC");
        setField(term8695, term8695.getClass(), "description", "PkWMRdJcBb");
        setBooleanField(term8695, term8695.getClass(), "required", true);
        setBooleanField(term8695, term8695.getClass(), "optionalArg", true);
        setIntField(term8695, term8695.getClass(), "numberOfArgs", 1227103734);
        setField(term8695, term8695.getClass(), "type", null);
        setField(term8695, term8695.getClass(), "values", term8704);
        setCharField(term8695, term8695.getClass(), "valuesep", 'T');
        setField(term8682, term8682.getClass(), "currentOption", term8695);
        setBooleanField(term8682, term8682.getClass(), "skipParsing", true);
        setField(term8682, term8682.getClass(), "expectedOpts", term8707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        Object retValue = callMethod(klass, "isArgument", argTypes, term1902, args);
        assertTrue(recursiveEquals(term1902, term8682));
        assertTrue(recursiveEquals(retValue, true));
    }

};


