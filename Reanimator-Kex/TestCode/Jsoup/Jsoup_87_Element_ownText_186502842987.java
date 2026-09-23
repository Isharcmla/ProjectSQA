package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_ownText_186502842987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6791;
     Object term6838;

    public Element_ownText_186502842987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6817 = new ArrayList();
        ((ArrayList) term6817).add((Object)null);
        ((ArrayList) term6817).add((Object)null);
        ((ArrayList) term6817).add((Object)null);
        ((ArrayList) term6817).add((Object)null);
        ((ArrayList) term6817).add((Object)null);
        term6791 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6792 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6813 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6814 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6815 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6821 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6823 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6824 = (Object[]) newArray("java.lang.String", 0);
        setField(term6792, term6792.getClass(), "tagName", "GrqozDKFOk");
        setBooleanField(term6792, term6792.getClass(), "isBlock", false);
        setBooleanField(term6792, term6792.getClass(), "formatAsBlock", true);
        setBooleanField(term6792, term6792.getClass(), "canContainInline", true);
        setBooleanField(term6792, term6792.getClass(), "empty", true);
        setBooleanField(term6792, term6792.getClass(), "selfClosing", false);
        setBooleanField(term6792, term6792.getClass(), "preserveWhitespace", true);
        setBooleanField(term6792, term6792.getClass(), "formList", false);
        setBooleanField(term6792, term6792.getClass(), "formSubmit", true);
        setField(term6791, term6791.getClass(), "tag", term6792);
        setField(term6813, term6813.getClass(), "referent", null);
        setField(term6814, term6814.getClass(), "lock", term6815);
        setField(term6814, term6814.getClass(), "head", null);
        setLongField(term6814, term6814.getClass(), "queueLength", -1983291584002806658L);
        setField(term6813, term6813.getClass(), "queue", term6814);
        setField(term6813, term6813.getClass(), "next", null);
        setField(term6813, term6813.getClass(), "discovered", null);
        setField(term6791, term6791.getClass(), "shadowChildrenRef", term6813);
        setField(term6791, term6791.getClass(), "childNodes", term6817);
        setIntField(term6821, term6821.getClass(), "size", -1656687479);
        setField(term6821, term6821.getClass(), "keys", term6823);
        setField(term6821, term6821.getClass(), "vals", term6824);
        setField(term6791, term6791.getClass(), "attributes", term6821);
        setField(term6791, term6791.getClass(), "baseUri", "CFyoseFGLF");
        setField(term6791, term6791.getClass(), "parentNode", null);
        setIntField(term6791, term6791.getClass(), "siblingIndex", -249614216);
        term6838 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6839 = (byte[]) newByteArray(16);
        setField(term6838, term6838.getClass(), "value", term6839);
        setByteField(term6838, term6838.getClass(), "coder", (byte) 47);
        setIntField(term6838, term6838.getClass(), "count", 1870727665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term6838;
        callMethod(klass, "ownText", argTypes, term6791, args);
    }

};


