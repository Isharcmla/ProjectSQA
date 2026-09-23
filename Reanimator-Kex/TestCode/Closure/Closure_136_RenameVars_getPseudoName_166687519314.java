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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RenameVars_getPseudoName_166687519314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1030;

    public RenameVars_getPseudoName_166687519314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1044 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1033, term1033.getClass(), "type", 1090617576);
        setIntField(term1035, term1035.getClass(), "type", -556405712);
        setField(term1035, term1035.getClass(), "next", null);
        setField(term1035, term1035.getClass(), "first", null);
        setField(term1035, term1035.getClass(), "last", null);
        setField(term1035, term1035.getClass(), "propListHead", null);
        setIntField(term1035, term1035.getClass(), "sourcePosition", -1772434990);
        setField(term1035, term1035.getClass(), "jsType", null);
        setField(term1035, term1035.getClass(), "parent", null);
        setField(term1033, term1033.getClass(), "next", term1035);
        setIntField(term1038, term1038.getClass(), "type", 0);
        setField(term1038, term1038.getClass(), "next", null);
        setField(term1038, term1038.getClass(), "first", null);
        setField(term1038, term1038.getClass(), "last", null);
        setField(term1038, term1038.getClass(), "propListHead", null);
        setIntField(term1038, term1038.getClass(), "sourcePosition", 0);
        setField(term1038, term1038.getClass(), "jsType", null);
        setField(term1038, term1038.getClass(), "parent", null);
        setField(term1033, term1033.getClass(), "first", term1038);
        setIntField(term1041, term1041.getClass(), "type", 0);
        setField(term1041, term1041.getClass(), "next", null);
        setField(term1041, term1041.getClass(), "first", null);
        setField(term1041, term1041.getClass(), "last", null);
        setField(term1041, term1041.getClass(), "propListHead", null);
        setIntField(term1041, term1041.getClass(), "sourcePosition", 0);
        setField(term1041, term1041.getClass(), "jsType", null);
        setField(term1041, term1041.getClass(), "parent", null);
        setField(term1033, term1033.getClass(), "last", term1041);
        setField(term1044, term1044.getClass(), "next", null);
        setIntField(term1044, term1044.getClass(), "type", 0);
        setIntField(term1044, term1044.getClass(), "intValue", 0);
        setField(term1044, term1044.getClass(), "objectValue", null);
        setField(term1033, term1033.getClass(), "propListHead", term1044);
        setIntField(term1033, term1033.getClass(), "sourcePosition", -1845499264);
        setField(term1033, term1033.getClass(), "jsType", null);
        setField(term1033, term1033.getClass(), "parent", null);
        Object term1048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1048, term1048.getClass(), "type", 0);
        setField(term1048, term1048.getClass(), "next", null);
        setField(term1048, term1048.getClass(), "first", null);
        setField(term1048, term1048.getClass(), "last", null);
        setField(term1048, term1048.getClass(), "propListHead", null);
        setIntField(term1048, term1048.getClass(), "sourcePosition", 0);
        setField(term1048, term1048.getClass(), "jsType", null);
        setField(term1048, term1048.getClass(), "parent", null);
        Object term1051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1051, term1051.getClass(), "type", 0);
        setField(term1051, term1051.getClass(), "next", null);
        setField(term1051, term1051.getClass(), "first", null);
        setField(term1051, term1051.getClass(), "last", null);
        setField(term1051, term1051.getClass(), "propListHead", null);
        setIntField(term1051, term1051.getClass(), "sourcePosition", 0);
        setField(term1051, term1051.getClass(), "jsType", null);
        setField(term1051, term1051.getClass(), "parent", null);
        Object term1054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1054, term1054.getClass(), "type", 0);
        setField(term1054, term1054.getClass(), "next", null);
        setField(term1054, term1054.getClass(), "first", null);
        setField(term1054, term1054.getClass(), "last", null);
        setField(term1054, term1054.getClass(), "propListHead", null);
        setIntField(term1054, term1054.getClass(), "sourcePosition", 0);
        setField(term1054, term1054.getClass(), "jsType", null);
        setField(term1054, term1054.getClass(), "parent", null);
        ArrayList term1031 = new ArrayList();
        ((ArrayList) term1031).add(term1033);
        ((ArrayList) term1031).add(term1048);
        ((ArrayList) term1031).add(term1051);
        ((ArrayList) term1031).add(term1054);
        ArrayList term1059 = new ArrayList();
        ((ArrayList) term1059).add(term1048);
        ArrayList term1063 = new ArrayList();
        ((ArrayList) term1063).add("YRHGsAkhxb");
        ((ArrayList) term1063).add("ffYhPOzlUs");
        HashMap term1092 = new HashMap();
        Set<Object> term5883 =  ((Map) term1092).keySet();
        HashSet term1091 = new HashSet((Collection<? extends Object>) term5883);
        HashMap term1111 = new HashMap();
        Set<Object> term5884 =  ((Map) term1111).keySet();
        HashSet term1110 = new HashSet((Collection<? extends Object>) term5884);
        HashMap term1119 = new HashMap();
        term1030 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term1129 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term1143 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1144 = (byte[]) newByteArray(16);
        Object term1163 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1164 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1177 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars$Assignment"));
        char[] term1186 = (char[]) newCharArray(1);
        setField(term1030, term1030.getClass(), "compiler", null);
        setField(term1030, term1030.getClass(), "globalNameNodes", term1031);
        setField(term1030, term1030.getClass(), "localNameNodes", term1059);
        setField(term1030, term1030.getClass(), "localTempNames", term1063);
        setField(term1030, term1030.getClass(), "externNames", term1091);
        setField(term1030, term1030.getClass(), "reservedNames", term1110);
        setField(term1030, term1030.getClass(), "renameMap", term1119);
        setField(term1129, term1129.getClass(), "map", null);
        setField(term1129, term1129.getClass(), "reverseMap", null);
        setField(term1030, term1030.getClass(), "prevUsedRenameMap", term1129);
        setField(term1030, term1030.getClass(), "prefix", "kBdSllIBVz");
        setIntField(term1030, term1030.getClass(), "assignmentCount", -505439934);
        setField(term1143, term1143.getClass(), "value", term1144);
        setByteField(term1143, term1143.getClass(), "coder", (byte) 0);
        setIntField(term1143, term1143.getClass(), "count", 0);
        setField(term1030, term1030.getClass(), "assignmentLog", term1143);
        setField(term1163, term1163.getClass(), "comparator", null);
        setField(term1164, term1164.getClass(), "key", "TJmVBGfTML");
        setField(term1177, term1177.getClass(), "input", null);
        setField(term1177, term1177.getClass(), "oldName", null);
        setIntField(term1177, term1177.getClass(), "orderOfOccurrence", 0);
        setField(term1177, term1177.getClass(), "newName", null);
        setIntField(term1177, term1177.getClass(), "count", 0);
        setField(term1177, term1177.getClass(), "this$0", null);
        setField(term1164, term1164.getClass(), "value", term1177);
        setField(term1164, term1164.getClass(), "left", null);
        setField(term1164, term1164.getClass(), "right", null);
        setField(term1164, term1164.getClass(), "parent", null);
        setBooleanField(term1164, term1164.getClass(), "color", true);
        setField(term1163, term1163.getClass(), "root", term1164);
        setIntField(term1163, term1163.getClass(), "size", 1);
        setIntField(term1163, term1163.getClass(), "modCount", 1);
        setField(term1163, term1163.getClass(), "entrySet", null);
        setField(term1163, term1163.getClass(), "navigableKeySet", null);
        setField(term1163, term1163.getClass(), "descendingMap", null);
        setField(term1163, term1163.getClass(), "keySet", null);
        setField(term1163, term1163.getClass(), "values", null);
        setField(term1030, term1030.getClass(), "assignments", term1163);
        setBooleanField(term1030, term1030.getClass(), "localRenamingOnly", false);
        setBooleanField(term1030, term1030.getClass(), "preserveAnonymousFunctionNames", true);
        setBooleanField(term1030, term1030.getClass(), "generatePseudoNames", false);
        setCharElement(term1186, 0, 'j');
        setField(term1030, term1030.getClass(), "reservedCharacters", term1186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tPlsykYBqO";
        try {
            callMethod(klass, "getPseudoName", argTypes, term1030, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


