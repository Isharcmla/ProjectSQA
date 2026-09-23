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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class DefaultParser_parse_105771338251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19584;
     Object term19868;
     Object term19269;
     Object term20214;
     Object term20234;
     Object term20239;
     Object term20116;

    public DefaultParser_parse_105771338251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19584 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term19690 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        Object term19764 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term19584, term19584.getClass(), "options", null);
        setBooleanField(term19584, term19584.getClass(), "stopAtNonOption", false);
        setBooleanField(term19584, term19584.getClass(), "skipParsing", false);
        setField(term19584, term19584.getClass(), "currentOption", null);
        setField(term19690, term19690.getClass(), "c", null);
        setField(term19690, term19690.getClass(), "list", null);
        setField(term19584, term19584.getClass(), "expectedOpts", term19690);
        setField(term19584, term19584.getClass(), "cmd", term19764);
        setField(term19584, term19584.getClass(), "currentToken", "");
        ArrayList term19920 = new ArrayList();
        LinkedHashMap term19980 = new LinkedHashMap();
        term19868 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19868, term19868.getClass(), "requiredOpts", term19920);
        setField(term19868, term19868.getClass(), "optionGroups", term19980);
        term19269 = (Object[]) newArray("java.lang.String", 4);
        setElement(term19269, 0, "");
        setElement(term19269, 1, "--");
        setElement(term19269, 2, "");
        setElement(term19269, 3, "");
        LinkedList term20216 = new LinkedList();
        ((LinkedList) term20216).add("");
        ((LinkedList) term20216).add("");
        ((LinkedList) term20216).add((Object)null);
        ArrayList term20223 = new ArrayList();
        ArrayList term20226 = new ArrayList();
        LinkedHashMap term20228 = new LinkedHashMap();
        ArrayList term20232 = new ArrayList();
        term20214 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term20215 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term20225 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term20215, term20215.getClass(), "args", term20216);
        setField(term20215, term20215.getClass(), "options", term20223);
        setField(term20214, term20214.getClass(), "cmd", term20215);
        setField(term20225, term20225.getClass(), "shortOpts", null);
        setField(term20225, term20225.getClass(), "longOpts", null);
        setField(term20225, term20225.getClass(), "requiredOpts", term20226);
        setField(term20225, term20225.getClass(), "optionGroups", term20228);
        setField(term20214, term20214.getClass(), "options", term20225);
        setBooleanField(term20214, term20214.getClass(), "stopAtNonOption", false);
        setField(term20214, term20214.getClass(), "currentToken", "");
        setField(term20214, term20214.getClass(), "currentOption", null);
        setBooleanField(term20214, term20214.getClass(), "skipParsing", true);
        setField(term20214, term20214.getClass(), "expectedOpts", term20232);
        ArrayList term20235 = new ArrayList();
        LinkedHashMap term20237 = new LinkedHashMap();
        term20234 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term20234, term20234.getClass(), "shortOpts", null);
        setField(term20234, term20234.getClass(), "longOpts", null);
        setField(term20234, term20234.getClass(), "requiredOpts", term20235);
        setField(term20234, term20234.getClass(), "optionGroups", term20237);
        term20239 = (Object[]) newArray("java.lang.String", 4);
        setElement(term20239, 0, "");
        setElement(term20239, 1, "--");
        setElement(term20239, 2, "");
        setElement(term20239, 3, "");
        LinkedList term20117 = new LinkedList();
        ((LinkedList) term20117).add("");
        ((LinkedList) term20117).add("");
        ((LinkedList) term20117).add((Object)null);
        ArrayList term20126 = new ArrayList();
        term20116 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term20116, term20116.getClass(), "args", term20117);
        setField(term20116, term20116.getClass(), "options", term20126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term19868;
        args[1] = term19269;
        args[2] = false;
        Object retValue = callMethod(klass, "parse", argTypes, term19584, args);
        assertTrue(recursiveEquals(term19584, term20214));
        assertTrue(recursiveEquals(term19868, term20234));
        assertTrue(recursiveEquals(term19269, term20239));
        assertTrue(recursiveEquals(retValue, term20116));
    }

};


