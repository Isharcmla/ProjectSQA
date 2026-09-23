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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4191652;
     Object term4191744;
     Object term4199432;
     Object term4199433;
     Object term4193690;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4191652 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4191744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4191836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4191928 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4192020 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4192188 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term4191836, term4191836.getClass(), "type", 35);
        setIntField(term4192020, term4192020.getClass(), "type", 40);
        setField(term4192020, term4192020.getClass(), "str", "charCodeAt");
        setField(term4191928, term4191928.getClass(), "next", term4192020);
        setIntField(term4191928, term4191928.getClass(), "type", 40);
        setField(term4191928, term4191928.getClass(), "str", "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003");
        setField(term4191836, term4191836.getClass(), "first", term4191928);
        setIntField(term4192188, term4192188.getClass(), "type", 39);
        setField(term4192188, term4192188.getClass(), "next", null);
        setDoubleField(term4192188, term4192188.getClass(), "number", 6.9141513279198085E18);
        setField(term4191836, term4191836.getClass(), "next", term4192188);
        setField(term4191744, term4191744.getClass(), "first", term4191836);
        setIntField(term4191744, term4191744.getClass(), "type", 37);
        term4199432 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4199432, term4199432.getClass(), "currentTraversal", null);
        term4199433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4199434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4199435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4199436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4199439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4199433, term4199433.getClass(), "str", null);
        setIntField(term4199433, term4199433.getClass(), "type", 37);
        setField(term4199433, term4199433.getClass(), "next", null);
        setField(term4199434, term4199434.getClass(), "str", null);
        setIntField(term4199434, term4199434.getClass(), "type", 35);
        setDoubleField(term4199435, term4199435.getClass(), "number", 6.9141513279198085E18);
        setIntField(term4199435, term4199435.getClass(), "type", 39);
        setField(term4199435, term4199435.getClass(), "next", null);
        setField(term4199435, term4199435.getClass(), "first", null);
        setField(term4199435, term4199435.getClass(), "last", null);
        setField(term4199435, term4199435.getClass(), "propListHead", null);
        setIntField(term4199435, term4199435.getClass(), "sourcePosition", 0);
        setField(term4199435, term4199435.getClass(), "jsType", null);
        setField(term4199435, term4199435.getClass(), "parent", null);
        setField(term4199434, term4199434.getClass(), "next", term4199435);
        setField(term4199436, term4199436.getClass(), "str", "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003");
        setIntField(term4199436, term4199436.getClass(), "type", 40);
        setField(term4199439, term4199439.getClass(), "str", "");
        setIntField(term4199439, term4199439.getClass(), "type", 40);
        setField(term4199439, term4199439.getClass(), "next", null);
        setField(term4199439, term4199439.getClass(), "first", null);
        setField(term4199439, term4199439.getClass(), "last", null);
        setField(term4199439, term4199439.getClass(), "propListHead", null);
        setIntField(term4199439, term4199439.getClass(), "sourcePosition", 0);
        setField(term4199439, term4199439.getClass(), "jsType", null);
        setField(term4199439, term4199439.getClass(), "parent", null);
        setField(term4199436, term4199436.getClass(), "next", term4199439);
        setField(term4199436, term4199436.getClass(), "first", null);
        setField(term4199436, term4199436.getClass(), "last", null);
        setField(term4199436, term4199436.getClass(), "propListHead", null);
        setIntField(term4199436, term4199436.getClass(), "sourcePosition", 0);
        setField(term4199436, term4199436.getClass(), "jsType", null);
        setField(term4199436, term4199436.getClass(), "parent", null);
        setField(term4199434, term4199434.getClass(), "first", term4199436);
        setField(term4199434, term4199434.getClass(), "last", null);
        setField(term4199434, term4199434.getClass(), "propListHead", null);
        setIntField(term4199434, term4199434.getClass(), "sourcePosition", 0);
        setField(term4199434, term4199434.getClass(), "jsType", null);
        setField(term4199434, term4199434.getClass(), "parent", null);
        setField(term4199433, term4199433.getClass(), "first", term4199434);
        setField(term4199433, term4199433.getClass(), "last", null);
        setField(term4199433, term4199433.getClass(), "propListHead", null);
        setIntField(term4199433, term4199433.getClass(), "sourcePosition", 0);
        setField(term4199433, term4199433.getClass(), "jsType", null);
        setField(term4199433, term4199433.getClass(), "parent", null);
        term4193690 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4193692 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4193694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4193698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4194194 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4193690, term4193690.getClass(), "str", null);
        setIntField(term4193690, term4193690.getClass(), "type", 37);
        setField(term4193690, term4193690.getClass(), "next", null);
        setField(term4193692, term4193692.getClass(), "str", null);
        setIntField(term4193692, term4193692.getClass(), "type", 35);
        setDoubleField(term4193694, term4193694.getClass(), "number", 6.9141513279198085E18);
        setIntField(term4193694, term4193694.getClass(), "type", 39);
        setField(term4193694, term4193694.getClass(), "next", null);
        setField(term4193694, term4193694.getClass(), "first", null);
        setField(term4193694, term4193694.getClass(), "last", null);
        setField(term4193694, term4193694.getClass(), "propListHead", null);
        setIntField(term4193694, term4193694.getClass(), "sourcePosition", 0);
        setField(term4193694, term4193694.getClass(), "jsType", null);
        setField(term4193694, term4193694.getClass(), "parent", null);
        setField(term4193692, term4193692.getClass(), "next", term4193694);
        setField(term4193698, term4193698.getClass(), "str", "\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003");
        setIntField(term4193698, term4193698.getClass(), "type", 40);
        setField(term4194194, term4194194.getClass(), "str", "");
        setIntField(term4194194, term4194194.getClass(), "type", 40);
        setField(term4194194, term4194194.getClass(), "next", null);
        setField(term4194194, term4194194.getClass(), "first", null);
        setField(term4194194, term4194194.getClass(), "last", null);
        setField(term4194194, term4194194.getClass(), "propListHead", null);
        setIntField(term4194194, term4194194.getClass(), "sourcePosition", 0);
        setField(term4194194, term4194194.getClass(), "jsType", null);
        setField(term4194194, term4194194.getClass(), "parent", null);
        setField(term4193698, term4193698.getClass(), "next", term4194194);
        setField(term4193698, term4193698.getClass(), "first", null);
        setField(term4193698, term4193698.getClass(), "last", null);
        setField(term4193698, term4193698.getClass(), "propListHead", null);
        setIntField(term4193698, term4193698.getClass(), "sourcePosition", 0);
        setField(term4193698, term4193698.getClass(), "jsType", null);
        setField(term4193698, term4193698.getClass(), "parent", null);
        setField(term4193692, term4193692.getClass(), "first", term4193698);
        setField(term4193692, term4193692.getClass(), "last", null);
        setField(term4193692, term4193692.getClass(), "propListHead", null);
        setIntField(term4193692, term4193692.getClass(), "sourcePosition", 0);
        setField(term4193692, term4193692.getClass(), "jsType", null);
        setField(term4193692, term4193692.getClass(), "parent", null);
        setField(term4193690, term4193690.getClass(), "first", term4193692);
        setField(term4193690, term4193690.getClass(), "last", null);
        setField(term4193690, term4193690.getClass(), "propListHead", null);
        setIntField(term4193690, term4193690.getClass(), "sourcePosition", 0);
        setField(term4193690, term4193690.getClass(), "jsType", null);
        setField(term4193690, term4193690.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4191744;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4191652, args);
        assertTrue(recursiveEquals(term4191652, term4199432));
        assertTrue(recursiveEquals(term4191744, term4199433));
        assertTrue(recursiveEquals(retValue, term4193690));
    }

};


