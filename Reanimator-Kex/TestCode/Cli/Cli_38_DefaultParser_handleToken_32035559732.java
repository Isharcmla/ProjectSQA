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

public class DefaultParser_handleToken_32035559732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1721;
     Object term8401;

    public DefaultParser_handleToken_32035559732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1723 = new LinkedList();
        ArrayList term1726 = new ArrayList();
        LinkedHashMap term1731 = new LinkedHashMap();
        LinkedHashMap term1737 = new LinkedHashMap();
        ArrayList term1743 = new ArrayList();
        LinkedHashMap term1747 = new LinkedHashMap();
        ArrayList term1818 = new ArrayList();
        ((ArrayList) term1818).add("");
        ((ArrayList) term1818).add("");
        ArrayList term1826 = new ArrayList();
        term1721 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1722 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1730 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1766 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1722, term1722.getClass(), "args", term1723);
        setField(term1722, term1722.getClass(), "options", term1726);
        setField(term1721, term1721.getClass(), "cmd", term1722);
        setField(term1730, term1730.getClass(), "shortOpts", term1731);
        setField(term1730, term1730.getClass(), "longOpts", term1737);
        setField(term1730, term1730.getClass(), "requiredOpts", term1743);
        setField(term1730, term1730.getClass(), "optionGroups", term1747);
        setField(term1721, term1721.getClass(), "options", term1730);
        setBooleanField(term1721, term1721.getClass(), "stopAtNonOption", true);
        setField(term1721, term1721.getClass(), "currentToken", "oVgzLbrsFr");
        setField(term1766, term1766.getClass(), "opt", "vQVyKLdtaz");
        setField(term1766, term1766.getClass(), "longOpt", "OWKQODBLzb");
        setField(term1766, term1766.getClass(), "argName", "wGmYcqUkgE");
        setField(term1766, term1766.getClass(), "description", "idgaQsnJpQ");
        setBooleanField(term1766, term1766.getClass(), "required", true);
        setBooleanField(term1766, term1766.getClass(), "optionalArg", true);
        setIntField(term1766, term1766.getClass(), "numberOfArgs", -2038273078);
        setField(term1766, term1766.getClass(), "type", null);
        setField(term1766, term1766.getClass(), "values", term1818);
        setCharField(term1766, term1766.getClass(), "valuesep", 't');
        setField(term1721, term1721.getClass(), "currentOption", term1766);
        setBooleanField(term1721, term1721.getClass(), "skipParsing", true);
        setField(term1721, term1721.getClass(), "expectedOpts", term1826);
        LinkedList term8403 = new LinkedList();
        ((LinkedList) term8403).add("");
        ArrayList term8406 = new ArrayList();
        LinkedHashMap term8409 = new LinkedHashMap();
        LinkedHashMap term8410 = new LinkedHashMap();
        ArrayList term8411 = new ArrayList();
        LinkedHashMap term8413 = new LinkedHashMap();
        ArrayList term8425 = new ArrayList();
        ((ArrayList) term8425).add("");
        ((ArrayList) term8425).add("");
        ArrayList term8429 = new ArrayList();
        term8401 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term8402 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term8408 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term8416 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8402, term8402.getClass(), "args", term8403);
        setField(term8402, term8402.getClass(), "options", term8406);
        setField(term8401, term8401.getClass(), "cmd", term8402);
        setField(term8408, term8408.getClass(), "shortOpts", term8409);
        setField(term8408, term8408.getClass(), "longOpts", term8410);
        setField(term8408, term8408.getClass(), "requiredOpts", term8411);
        setField(term8408, term8408.getClass(), "optionGroups", term8413);
        setField(term8401, term8401.getClass(), "options", term8408);
        setBooleanField(term8401, term8401.getClass(), "stopAtNonOption", true);
        setField(term8401, term8401.getClass(), "currentToken", "bWWfajKbEX");
        setField(term8416, term8416.getClass(), "opt", "vQVyKLdtaz");
        setField(term8416, term8416.getClass(), "longOpt", "OWKQODBLzb");
        setField(term8416, term8416.getClass(), "argName", "wGmYcqUkgE");
        setField(term8416, term8416.getClass(), "description", "idgaQsnJpQ");
        setBooleanField(term8416, term8416.getClass(), "required", true);
        setBooleanField(term8416, term8416.getClass(), "optionalArg", true);
        setIntField(term8416, term8416.getClass(), "numberOfArgs", -2038273078);
        setField(term8416, term8416.getClass(), "type", null);
        setField(term8416, term8416.getClass(), "values", term8425);
        setCharField(term8416, term8416.getClass(), "valuesep", 't');
        setField(term8401, term8401.getClass(), "currentOption", term8416);
        setBooleanField(term8401, term8401.getClass(), "skipParsing", true);
        setField(term8401, term8401.getClass(), "expectedOpts", term8429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "handleToken", argTypes, term1721, args);
        assertTrue(recursiveEquals(term1721, term8401));
    }

};


