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
import java.util.HashMap;
import java.lang.Boolean;

public class DefaultParser_parse_105771338227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;
     Object term682;
     Object term702;
     Object term811;
     Object term6268;
     Object term6296;
     Object term6303;
     Object term5604;

    public DefaultParser_parse_105771338227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term579 = new LinkedList();
        ArrayList term582 = new ArrayList();
        HashMap term587 = new HashMap();
        HashMap term592 = new HashMap();
        ArrayList term597 = new ArrayList();
        HashMap term601 = new HashMap();
        ArrayList term672 = new ArrayList();
        ArrayList term678 = new ArrayList();
        term577 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term578 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term586 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term619 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term671 = newInstance(Class.forName("java.lang.Object"));
        setField(term578, term578.getClass(), "args", term579);
        setField(term578, term578.getClass(), "options", term582);
        setField(term577, term577.getClass(), "cmd", term578);
        setField(term586, term586.getClass(), "shortOpts", term587);
        setField(term586, term586.getClass(), "longOpts", term592);
        setField(term586, term586.getClass(), "requiredOpts", term597);
        setField(term586, term586.getClass(), "optionGroups", term601);
        setField(term577, term577.getClass(), "options", term586);
        setBooleanField(term577, term577.getClass(), "stopAtNonOption", false);
        setField(term577, term577.getClass(), "currentToken", "pCTimMblYc");
        setField(term619, term619.getClass(), "opt", "hNxWaHcfhY");
        setField(term619, term619.getClass(), "longOpt", "RkybSrpybU");
        setField(term619, term619.getClass(), "argName", "xOEqzGAmDU");
        setField(term619, term619.getClass(), "description", "eZFUvlxvGV");
        setBooleanField(term619, term619.getClass(), "required", true);
        setBooleanField(term619, term619.getClass(), "optionalArg", false);
        setIntField(term619, term619.getClass(), "numberOfArgs", 1484323161);
        setField(term619, term619.getClass(), "type", term671);
        setField(term619, term619.getClass(), "values", term672);
        setCharField(term619, term619.getClass(), "valuesep", 'E');
        setField(term577, term577.getClass(), "currentOption", term619);
        setBooleanField(term577, term577.getClass(), "skipParsing", true);
        setField(term577, term577.getClass(), "expectedOpts", term678);
        HashMap term683 = new HashMap();
        HashMap term688 = new HashMap();
        ArrayList term693 = new ArrayList();
        HashMap term697 = new HashMap();
        term682 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term682, term682.getClass(), "shortOpts", term683);
        setField(term682, term682.getClass(), "longOpts", term688);
        setField(term682, term682.getClass(), "requiredOpts", term693);
        setField(term682, term682.getClass(), "optionGroups", term697);
        term702 = (Object[]) newArray("java.lang.String", 9);
        setElement(term702, 0, "BYqFIqCKAV");
        setElement(term702, 1, "vrQLuWIDJX");
        setElement(term702, 2, "flxyYxBRtu");
        setElement(term702, 3, "OclPbYPkcH");
        setElement(term702, 4, "IoAlmYsBwc");
        setElement(term702, 5, "TEParAifyi");
        setElement(term702, 6, "OWDIEULEFu");
        setElement(term702, 7, "dWRymuLBtr");
        setElement(term702, 8, "AijpHYOFuy");
        term811 = new Boolean(false);
        LinkedList term6270 = new LinkedList();
        ((LinkedList) term6270).add("BYqFIqCKAV");
        ((LinkedList) term6270).add("");
        ((LinkedList) term6270).add((Object)null);
        ((LinkedList) term6270).add((Object)null);
        ((LinkedList) term6270).add((Object)null);
        ((LinkedList) term6270).add((Object)null);
        ((LinkedList) term6270).add((Object)null);
        ((LinkedList) term6270).add((Object)null);
        ((LinkedList) term6270).add((Object)null);
        ArrayList term6283 = new ArrayList();
        HashMap term6286 = new HashMap();
        HashMap term6287 = new HashMap();
        ArrayList term6288 = new ArrayList();
        HashMap term6290 = new HashMap();
        ArrayList term6294 = new ArrayList();
        term6268 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term6269 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term6285 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term6269, term6269.getClass(), "args", term6270);
        setField(term6269, term6269.getClass(), "options", term6283);
        setField(term6268, term6268.getClass(), "cmd", term6269);
        setField(term6285, term6285.getClass(), "shortOpts", term6286);
        setField(term6285, term6285.getClass(), "longOpts", term6287);
        setField(term6285, term6285.getClass(), "requiredOpts", term6288);
        setField(term6285, term6285.getClass(), "optionGroups", term6290);
        setField(term6268, term6268.getClass(), "options", term6285);
        setBooleanField(term6268, term6268.getClass(), "stopAtNonOption", false);
        setField(term6268, term6268.getClass(), "currentToken", "AijpHYOFuy");
        setField(term6268, term6268.getClass(), "currentOption", null);
        setBooleanField(term6268, term6268.getClass(), "skipParsing", false);
        setField(term6268, term6268.getClass(), "expectedOpts", term6294);
        HashMap term6297 = new HashMap();
        HashMap term6298 = new HashMap();
        ArrayList term6299 = new ArrayList();
        HashMap term6301 = new HashMap();
        term6296 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term6296, term6296.getClass(), "shortOpts", term6297);
        setField(term6296, term6296.getClass(), "longOpts", term6298);
        setField(term6296, term6296.getClass(), "requiredOpts", term6299);
        setField(term6296, term6296.getClass(), "optionGroups", term6301);
        term6303 = (Object[]) newArray("java.lang.String", 9);
        setElement(term6303, 0, "BYqFIqCKAV");
        setElement(term6303, 1, "vrQLuWIDJX");
        setElement(term6303, 2, "flxyYxBRtu");
        setElement(term6303, 3, "OclPbYPkcH");
        setElement(term6303, 4, "IoAlmYsBwc");
        setElement(term6303, 5, "TEParAifyi");
        setElement(term6303, 6, "OWDIEULEFu");
        setElement(term6303, 7, "dWRymuLBtr");
        setElement(term6303, 8, "AijpHYOFuy");
        LinkedList term5605 = new LinkedList();
        ((LinkedList) term5605).add("BYqFIqCKAV");
        ((LinkedList) term5605).add("");
        ((LinkedList) term5605).add((Object)null);
        ((LinkedList) term5605).add((Object)null);
        ((LinkedList) term5605).add((Object)null);
        ((LinkedList) term5605).add((Object)null);
        ((LinkedList) term5605).add((Object)null);
        ((LinkedList) term5605).add((Object)null);
        ((LinkedList) term5605).add((Object)null);
        ArrayList term5640 = new ArrayList();
        term5604 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term5604, term5604.getClass(), "args", term5605);
        setField(term5604, term5604.getClass(), "options", term5640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term682;
        args[1] = term702;
        args[2] = term811;
        Object retValue = callMethod(klass, "parse", argTypes, term577, args);
        assertTrue(recursiveEquals(term577, term6268));
        assertTrue(recursiveEquals(term682, term6296));
        assertTrue(recursiveEquals(term702, term6303));
        assertTrue(recursiveEquals(term811, false));
        assertTrue(recursiveEquals(retValue, term5604));
    }

};


