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
import java.util.HashMap;
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_process_106877365513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term39;
     Object term66;

    public ReferenceCollectingCallback_process_106877365513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        Object term17 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term17, term17.getClass(), "parent", null);
        setBooleanField(term17, term17.getClass(), "isHoisted", false);
        setBooleanField(term17, term17.getClass(), "isFunction", false);
        setBooleanField(term17, term17.getClass(), "isLoop", false);
        Object term21 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term21, term21.getClass(), "parent", null);
        setBooleanField(term21, term21.getClass(), "isHoisted", false);
        setBooleanField(term21, term21.getClass(), "isFunction", false);
        setBooleanField(term21, term21.getClass(), "isLoop", false);
        Object term25 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term25, term25.getClass(), "parent", null);
        setBooleanField(term25, term25.getClass(), "isHoisted", false);
        setBooleanField(term25, term25.getClass(), "isFunction", false);
        setBooleanField(term25, term25.getClass(), "isLoop", false);
        Object term29 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term29, term29.getClass(), "parent", null);
        setBooleanField(term29, term29.getClass(), "isHoisted", false);
        setBooleanField(term29, term29.getClass(), "isFunction", false);
        setBooleanField(term29, term29.getClass(), "isLoop", false);
        Object term33 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term33, term33.getClass(), "parent", null);
        setBooleanField(term33, term33.getClass(), "isHoisted", false);
        setBooleanField(term33, term33.getClass(), "isFunction", false);
        setBooleanField(term33, term33.getClass(), "isLoop", false);
        ArrayDeque term15 = new ArrayDeque();
        ((ArrayDeque) term15).add(term17);
        ((ArrayDeque) term15).add(term21);
        ((ArrayDeque) term15).add(term25);
        ((ArrayDeque) term15).add(term29);
        ((ArrayDeque) term15).add(term33);
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term1, term1.getClass(), "referenceMap", term2);
        setField(term1, term1.getClass(), "blockStack", term15);
        setField(term1, term1.getClass(), "behavior", null);
        setField(term1, term1.getClass(), "compiler", null);
        setField(term1, term1.getClass(), "varFilter", null);
        term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term39, term39.getClass(), "type", -883034806);
        setIntField(term41, term41.getClass(), "type", -1456670397);
        setIntField(term43, term43.getClass(), "type", 0);
        setField(term43, term43.getClass(), "next", null);
        setField(term43, term43.getClass(), "first", null);
        setField(term43, term43.getClass(), "last", null);
        setField(term43, term43.getClass(), "propListHead", null);
        setIntField(term43, term43.getClass(), "sourcePosition", 0);
        setField(term43, term43.getClass(), "jsType", null);
        setField(term43, term43.getClass(), "parent", null);
        setField(term41, term41.getClass(), "next", term43);
        setIntField(term46, term46.getClass(), "type", 0);
        setField(term46, term46.getClass(), "next", null);
        setField(term46, term46.getClass(), "first", null);
        setField(term46, term46.getClass(), "last", null);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term41, term41.getClass(), "first", term46);
        setIntField(term49, term49.getClass(), "type", 0);
        setField(term49, term49.getClass(), "next", null);
        setField(term49, term49.getClass(), "first", null);
        setField(term49, term49.getClass(), "last", null);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term41, term41.getClass(), "last", term49);
        setField(term52, term52.getClass(), "next", null);
        setIntField(term52, term52.getClass(), "type", 0);
        setIntField(term52, term52.getClass(), "intValue", 0);
        setField(term52, term52.getClass(), "objectValue", null);
        setField(term41, term41.getClass(), "propListHead", term52);
        setIntField(term41, term41.getClass(), "sourcePosition", -655067527);
        setField(term41, term41.getClass(), "jsType", null);
        setField(term41, term41.getClass(), "parent", null);
        setField(term39, term39.getClass(), "next", term41);
        setIntField(term56, term56.getClass(), "type", 0);
        setField(term56, term56.getClass(), "next", null);
        setField(term56, term56.getClass(), "first", null);
        setField(term56, term56.getClass(), "last", null);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term39, term39.getClass(), "first", term56);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term39, term39.getClass(), "last", term59);
        setField(term62, term62.getClass(), "next", null);
        setIntField(term62, term62.getClass(), "type", 0);
        setIntField(term62, term62.getClass(), "intValue", 0);
        setField(term62, term62.getClass(), "objectValue", null);
        setField(term39, term39.getClass(), "propListHead", term62);
        setIntField(term39, term39.getClass(), "sourcePosition", -6029667);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term66, term66.getClass(), "type", 1135664017);
        setIntField(term68, term68.getClass(), "type", -244121226);
        setIntField(term70, term70.getClass(), "type", 0);
        setField(term70, term70.getClass(), "next", null);
        setField(term70, term70.getClass(), "first", null);
        setField(term70, term70.getClass(), "last", null);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term68, term68.getClass(), "next", term70);
        setIntField(term73, term73.getClass(), "type", 0);
        setField(term73, term73.getClass(), "next", null);
        setField(term73, term73.getClass(), "first", null);
        setField(term73, term73.getClass(), "last", null);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term68, term68.getClass(), "first", term73);
        setIntField(term76, term76.getClass(), "type", 0);
        setField(term76, term76.getClass(), "next", null);
        setField(term76, term76.getClass(), "first", null);
        setField(term76, term76.getClass(), "last", null);
        setField(term76, term76.getClass(), "propListHead", null);
        setIntField(term76, term76.getClass(), "sourcePosition", 0);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term68, term68.getClass(), "last", term76);
        setField(term79, term79.getClass(), "next", null);
        setIntField(term79, term79.getClass(), "type", 0);
        setIntField(term79, term79.getClass(), "intValue", 0);
        setField(term79, term79.getClass(), "objectValue", null);
        setField(term68, term68.getClass(), "propListHead", term79);
        setIntField(term68, term68.getClass(), "sourcePosition", -73683645);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term66, term66.getClass(), "next", term68);
        setIntField(term83, term83.getClass(), "type", 0);
        setField(term83, term83.getClass(), "next", null);
        setField(term83, term83.getClass(), "first", null);
        setField(term83, term83.getClass(), "last", null);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term66, term66.getClass(), "first", term83);
        setIntField(term86, term86.getClass(), "type", 0);
        setField(term86, term86.getClass(), "next", null);
        setField(term86, term86.getClass(), "first", null);
        setField(term86, term86.getClass(), "last", null);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term66, term66.getClass(), "last", term86);
        setField(term89, term89.getClass(), "next", null);
        setIntField(term89, term89.getClass(), "type", 0);
        setIntField(term89, term89.getClass(), "intValue", 0);
        setField(term89, term89.getClass(), "objectValue", null);
        setField(term66, term66.getClass(), "propListHead", term89);
        setIntField(term66, term66.getClass(), "sourcePosition", -226514366);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term39;
        args[1] = term66;
        try {
            callMethod(klass, "process", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


