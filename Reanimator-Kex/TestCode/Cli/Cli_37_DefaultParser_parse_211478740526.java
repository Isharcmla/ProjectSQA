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
import java.lang.IllegalArgumentException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class DefaultParser_parse_211478740526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;
     Object term364;
     Object term387;
     Object term460;

    public DefaultParser_parse_211478740526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term255 = new LinkedList();
        ArrayList term258 = new ArrayList();
        LinkedHashMap term263 = new LinkedHashMap();
        LinkedHashMap term269 = new LinkedHashMap();
        ArrayList term275 = new ArrayList();
        LinkedHashMap term279 = new LinkedHashMap();
        ArrayList term350 = new ArrayList();
        ((ArrayList) term350).add("");
        ((ArrayList) term350).add("");
        ((ArrayList) term350).add("");
        ((ArrayList) term350).add("");
        ArrayList term360 = new ArrayList();
        term253 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term254 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term262 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term298 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term254, term254.getClass(), "args", term255);
        setField(term254, term254.getClass(), "options", term258);
        setField(term253, term253.getClass(), "cmd", term254);
        setField(term262, term262.getClass(), "shortOpts", term263);
        setField(term262, term262.getClass(), "longOpts", term269);
        setField(term262, term262.getClass(), "requiredOpts", term275);
        setField(term262, term262.getClass(), "optionGroups", term279);
        setField(term253, term253.getClass(), "options", term262);
        setBooleanField(term253, term253.getClass(), "stopAtNonOption", true);
        setField(term253, term253.getClass(), "currentToken", "LQFpaHEwXR");
        setField(term298, term298.getClass(), "opt", "oVcInYnLWB");
        setField(term298, term298.getClass(), "longOpt", "aJlieCFVtF");
        setField(term298, term298.getClass(), "argName", "ZiaGIbnzTs");
        setField(term298, term298.getClass(), "description", "tbcdzjIfER");
        setBooleanField(term298, term298.getClass(), "required", true);
        setBooleanField(term298, term298.getClass(), "optionalArg", true);
        setIntField(term298, term298.getClass(), "numberOfArgs", 1162663216);
        setField(term298, term298.getClass(), "type", null);
        setField(term298, term298.getClass(), "values", term350);
        setCharField(term298, term298.getClass(), "valuesep", 'A');
        setField(term253, term253.getClass(), "currentOption", term298);
        setBooleanField(term253, term253.getClass(), "skipParsing", true);
        setField(term253, term253.getClass(), "expectedOpts", term360);
        LinkedHashMap term365 = new LinkedHashMap();
        LinkedHashMap term371 = new LinkedHashMap();
        ArrayList term377 = new ArrayList();
        LinkedHashMap term381 = new LinkedHashMap();
        term364 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term364, term364.getClass(), "shortOpts", term365);
        setField(term364, term364.getClass(), "longOpts", term371);
        setField(term364, term364.getClass(), "requiredOpts", term377);
        setField(term364, term364.getClass(), "optionGroups", term381);
        term387 = (Object[]) newArray("java.lang.String", 6);
        setElement(term387, 0, "xOEqzGAmDU");
        setElement(term387, 1, "eZFUvlxvGV");
        setElement(term387, 2, "BYqFIqCKAV");
        setElement(term387, 3, "vrQLuWIDJX");
        setElement(term387, 4, "flxyYxBRtu");
        setElement(term387, 5, "OclPbYPkcH");
        term460 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Class.forName("java.util.Properties");
        Object[] args = new Object[3];
        args[0] = term364;
        args[1] = term387;
        args[2] = term460;
        try {
            callMethod(klass, "parse", argTypes, term253, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


