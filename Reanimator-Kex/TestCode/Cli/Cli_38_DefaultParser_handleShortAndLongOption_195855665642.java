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

public class DefaultParser_handleShortAndLongOption_195855665642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3534;
     Object term12189;

    public DefaultParser_handleShortAndLongOption_195855665642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3536 = new LinkedList();
        ArrayList term3539 = new ArrayList();
        LinkedHashMap term3544 = new LinkedHashMap();
        LinkedHashMap term3550 = new LinkedHashMap();
        ArrayList term3556 = new ArrayList();
        LinkedHashMap term3560 = new LinkedHashMap();
        ArrayList term3631 = new ArrayList();
        ((ArrayList) term3631).add("");
        ArrayList term3638 = new ArrayList();
        term3534 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3535 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3543 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3579 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3535, term3535.getClass(), "args", term3536);
        setField(term3535, term3535.getClass(), "options", term3539);
        setField(term3534, term3534.getClass(), "cmd", term3535);
        setField(term3543, term3543.getClass(), "shortOpts", term3544);
        setField(term3543, term3543.getClass(), "longOpts", term3550);
        setField(term3543, term3543.getClass(), "requiredOpts", term3556);
        setField(term3543, term3543.getClass(), "optionGroups", term3560);
        setField(term3534, term3534.getClass(), "options", term3543);
        setBooleanField(term3534, term3534.getClass(), "stopAtNonOption", false);
        setField(term3534, term3534.getClass(), "currentToken", "hMmaoREuCK");
        setField(term3579, term3579.getClass(), "opt", "VeDtgDzGAN");
        setField(term3579, term3579.getClass(), "longOpt", "aWYOWZFyaX");
        setField(term3579, term3579.getClass(), "argName", "BRIVNtfUWU");
        setField(term3579, term3579.getClass(), "description", "DbiCVtPPCT");
        setBooleanField(term3579, term3579.getClass(), "required", false);
        setBooleanField(term3579, term3579.getClass(), "optionalArg", false);
        setIntField(term3579, term3579.getClass(), "numberOfArgs", -1456670397);
        setField(term3579, term3579.getClass(), "type", null);
        setField(term3579, term3579.getClass(), "values", term3631);
        setCharField(term3579, term3579.getClass(), "valuesep", 'R');
        setField(term3534, term3534.getClass(), "currentOption", term3579);
        setBooleanField(term3534, term3534.getClass(), "skipParsing", false);
        setField(term3534, term3534.getClass(), "expectedOpts", term3638);
        LinkedList term12191 = new LinkedList();
        ((LinkedList) term12191).add("");
        ArrayList term12194 = new ArrayList();
        LinkedHashMap term12197 = new LinkedHashMap();
        LinkedHashMap term12198 = new LinkedHashMap();
        ArrayList term12200 = new ArrayList();
        LinkedHashMap term12202 = new LinkedHashMap();
        ArrayList term12214 = new ArrayList();
        ((ArrayList) term12214).add("");
        ArrayList term12217 = new ArrayList();
        term12189 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term12190 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term12196 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term12205 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12190, term12190.getClass(), "args", term12191);
        setField(term12190, term12190.getClass(), "options", term12194);
        setField(term12189, term12189.getClass(), "cmd", term12190);
        setField(term12196, term12196.getClass(), "shortOpts", term12197);
        setField(term12196, term12196.getClass(), "longOpts", term12198);
        setField(term12196, term12196.getClass(), "requiredOpts", term12200);
        setField(term12196, term12196.getClass(), "optionGroups", term12202);
        setField(term12189, term12189.getClass(), "options", term12196);
        setBooleanField(term12189, term12189.getClass(), "stopAtNonOption", false);
        setField(term12189, term12189.getClass(), "currentToken", "hMmaoREuCK");
        setField(term12205, term12205.getClass(), "opt", "VeDtgDzGAN");
        setField(term12205, term12205.getClass(), "longOpt", "aWYOWZFyaX");
        setField(term12205, term12205.getClass(), "argName", "BRIVNtfUWU");
        setField(term12205, term12205.getClass(), "description", "DbiCVtPPCT");
        setBooleanField(term12205, term12205.getClass(), "required", false);
        setBooleanField(term12205, term12205.getClass(), "optionalArg", false);
        setIntField(term12205, term12205.getClass(), "numberOfArgs", -1456670397);
        setField(term12205, term12205.getClass(), "type", null);
        setField(term12205, term12205.getClass(), "values", term12214);
        setCharField(term12205, term12205.getClass(), "valuesep", 'R');
        setField(term12189, term12189.getClass(), "currentOption", term12205);
        setBooleanField(term12189, term12189.getClass(), "skipParsing", false);
        setField(term12189, term12189.getClass(), "expectedOpts", term12217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PapWxkhEWe";
        callMethod(klass, "handleShortAndLongOption", argTypes, term3534, args);
        assertTrue(recursiveEquals(term3534, term12189));
    }

};


