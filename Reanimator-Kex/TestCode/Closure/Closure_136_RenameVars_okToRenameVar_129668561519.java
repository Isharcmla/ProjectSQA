package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class RenameVars_okToRenameVar_129668561519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2592;
     Object term2741;

    public RenameVars_okToRenameVar_129668561519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2593 = new ArrayList();
        Object term2599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2599, term2599.getClass(), "type", 1555897383);
        setIntField(term2601, term2601.getClass(), "type", -1697741339);
        setField(term2601, term2601.getClass(), "next", null);
        setField(term2601, term2601.getClass(), "first", null);
        setField(term2601, term2601.getClass(), "last", null);
        setField(term2601, term2601.getClass(), "propListHead", null);
        setIntField(term2601, term2601.getClass(), "sourcePosition", 98922530);
        setField(term2601, term2601.getClass(), "jsType", null);
        setField(term2601, term2601.getClass(), "parent", null);
        setField(term2599, term2599.getClass(), "next", term2601);
        setIntField(term2604, term2604.getClass(), "type", 0);
        setField(term2604, term2604.getClass(), "next", null);
        setField(term2604, term2604.getClass(), "first", null);
        setField(term2604, term2604.getClass(), "last", null);
        setField(term2604, term2604.getClass(), "propListHead", null);
        setIntField(term2604, term2604.getClass(), "sourcePosition", 0);
        setField(term2604, term2604.getClass(), "jsType", null);
        setField(term2604, term2604.getClass(), "parent", null);
        setField(term2599, term2599.getClass(), "first", term2604);
        setIntField(term2607, term2607.getClass(), "type", 0);
        setField(term2607, term2607.getClass(), "next", null);
        setField(term2607, term2607.getClass(), "first", null);
        setField(term2607, term2607.getClass(), "last", null);
        setField(term2607, term2607.getClass(), "propListHead", null);
        setIntField(term2607, term2607.getClass(), "sourcePosition", 0);
        setField(term2607, term2607.getClass(), "jsType", null);
        setField(term2607, term2607.getClass(), "parent", null);
        setField(term2599, term2599.getClass(), "last", term2607);
        setField(term2610, term2610.getClass(), "next", null);
        setIntField(term2610, term2610.getClass(), "type", 0);
        setIntField(term2610, term2610.getClass(), "intValue", 0);
        setField(term2610, term2610.getClass(), "objectValue", null);
        setField(term2599, term2599.getClass(), "propListHead", term2610);
        setIntField(term2599, term2599.getClass(), "sourcePosition", -1388471422);
        setField(term2599, term2599.getClass(), "jsType", null);
        setField(term2599, term2599.getClass(), "parent", null);
        Object term2614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2614, term2614.getClass(), "type", 0);
        setField(term2614, term2614.getClass(), "next", null);
        setField(term2614, term2614.getClass(), "first", null);
        setField(term2614, term2614.getClass(), "last", null);
        setField(term2614, term2614.getClass(), "propListHead", null);
        setIntField(term2614, term2614.getClass(), "sourcePosition", 0);
        setField(term2614, term2614.getClass(), "jsType", null);
        setField(term2614, term2614.getClass(), "parent", null);
        Object term2617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2617, term2617.getClass(), "type", 0);
        setField(term2617, term2617.getClass(), "next", null);
        setField(term2617, term2617.getClass(), "first", null);
        setField(term2617, term2617.getClass(), "last", null);
        setField(term2617, term2617.getClass(), "propListHead", null);
        setIntField(term2617, term2617.getClass(), "sourcePosition", 0);
        setField(term2617, term2617.getClass(), "jsType", null);
        setField(term2617, term2617.getClass(), "parent", null);
        Object term2620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2620, term2620.getClass(), "type", 0);
        setField(term2620, term2620.getClass(), "next", null);
        setField(term2620, term2620.getClass(), "first", null);
        setField(term2620, term2620.getClass(), "last", null);
        setField(term2620, term2620.getClass(), "propListHead", null);
        setIntField(term2620, term2620.getClass(), "sourcePosition", 0);
        setField(term2620, term2620.getClass(), "jsType", null);
        setField(term2620, term2620.getClass(), "parent", null);
        ArrayList term2597 = new ArrayList();
        ((ArrayList) term2597).add(term2599);
        ((ArrayList) term2597).add(term2614);
        ((ArrayList) term2597).add(term2617);
        ((ArrayList) term2597).add(term2620);
        ArrayList term2625 = new ArrayList();
        ((ArrayList) term2625).add("uPuCVuZYOI");
        HashMap term2642 = new HashMap();
        Set<Object> term14674 =  ((Map) term2642).keySet();
        HashSet term2641 = new HashSet((Collection<? extends Object>) term14674);
        HashMap term2648 = new HashMap();
        Set<Object> term14675 =  ((Map) term2648).keySet();
        HashSet term2647 = new HashSet((Collection<? extends Object>) term14675);
        HashMap term2656 = new HashMap();
        term2592 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term2666 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term2680 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2681 = (byte[]) newByteArray(16);
        Object term2700 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2701 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2714 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars$Assignment"));
        char[] term2723 = (char[]) newCharArray(5);
        setField(term2592, term2592.getClass(), "compiler", null);
        setField(term2592, term2592.getClass(), "globalNameNodes", term2593);
        setField(term2592, term2592.getClass(), "localNameNodes", term2597);
        setField(term2592, term2592.getClass(), "localTempNames", term2625);
        setField(term2592, term2592.getClass(), "externNames", term2641);
        setField(term2592, term2592.getClass(), "reservedNames", term2647);
        setField(term2592, term2592.getClass(), "renameMap", term2656);
        setField(term2666, term2666.getClass(), "map", null);
        setField(term2666, term2666.getClass(), "reverseMap", null);
        setField(term2592, term2592.getClass(), "prevUsedRenameMap", term2666);
        setField(term2592, term2592.getClass(), "prefix", "iCCsaLHohG");
        setIntField(term2592, term2592.getClass(), "assignmentCount", -1498296052);
        setField(term2680, term2680.getClass(), "value", term2681);
        setByteField(term2680, term2680.getClass(), "coder", (byte) 0);
        setIntField(term2680, term2680.getClass(), "count", 0);
        setField(term2592, term2592.getClass(), "assignmentLog", term2680);
        setField(term2700, term2700.getClass(), "comparator", null);
        setField(term2701, term2701.getClass(), "key", "NJhGgctbdj");
        setField(term2714, term2714.getClass(), "input", null);
        setField(term2714, term2714.getClass(), "oldName", null);
        setIntField(term2714, term2714.getClass(), "orderOfOccurrence", 0);
        setField(term2714, term2714.getClass(), "newName", null);
        setIntField(term2714, term2714.getClass(), "count", 0);
        setField(term2714, term2714.getClass(), "this$0", null);
        setField(term2701, term2701.getClass(), "value", term2714);
        setField(term2701, term2701.getClass(), "left", null);
        setField(term2701, term2701.getClass(), "right", null);
        setField(term2701, term2701.getClass(), "parent", null);
        setBooleanField(term2701, term2701.getClass(), "color", true);
        setField(term2700, term2700.getClass(), "root", term2701);
        setIntField(term2700, term2700.getClass(), "size", 1);
        setIntField(term2700, term2700.getClass(), "modCount", 1);
        setField(term2700, term2700.getClass(), "entrySet", null);
        setField(term2700, term2700.getClass(), "navigableKeySet", null);
        setField(term2700, term2700.getClass(), "descendingMap", null);
        setField(term2700, term2700.getClass(), "keySet", null);
        setField(term2700, term2700.getClass(), "values", null);
        setField(term2592, term2592.getClass(), "assignments", term2700);
        setBooleanField(term2592, term2592.getClass(), "localRenamingOnly", true);
        setBooleanField(term2592, term2592.getClass(), "preserveAnonymousFunctionNames", true);
        setBooleanField(term2592, term2592.getClass(), "generatePseudoNames", false);
        setCharElement(term2723, 0, 'P');
        setCharElement(term2723, 1, 'w');
        setCharElement(term2723, 2, 'D');
        setCharElement(term2723, 3, 'Y');
        setCharElement(term2723, 4, 'F');
        setField(term2592, term2592.getClass(), "reservedCharacters", term2723);
        term2741 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "MYWYUeLGOp";
        args[1] = term2741;
        try {
            callMethod(klass, "okToRenameVar", argTypes, term2592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


