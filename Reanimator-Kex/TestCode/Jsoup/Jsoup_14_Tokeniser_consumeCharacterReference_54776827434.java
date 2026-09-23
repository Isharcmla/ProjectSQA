package org.jsoup.parser;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Character;
import java.lang.Boolean;

public class Tokeniser_consumeCharacterReference_54776827434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23599;
     Object term23851;
     Object term23853;

    public Tokeniser_consumeCharacterReference_54776827434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23617 = new ArrayList();
        Class<? extends Object> term100386 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term100385 = ((Class) term100386).getDeclaredField((String) "AfterDoctypePublicIdentifier");
        ((Field) term100385).setAccessible(true);
        Object enum411 = ((Field) term100385).get((Object) null);
        Class<? extends Object> term100712 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term100711 = ((Class) term100712).getDeclaredField((String) "Doctype");
        ((Field) term100711).setAccessible(true);
        Object enum412 = ((Field) term100711).get((Object) null);
        Class<? extends Object> term100916 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term100915 = ((Class) term100916).getDeclaredField((String) "Comment");
        ((Field) term100915).setAccessible(true);
        Object enum413 = ((Field) term100915).get((Object) null);
        Class<? extends Object> term101134 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term101133 = ((Class) term101134).getDeclaredField((String) "StartTag");
        ((Field) term101133).setAccessible(true);
        Object enum414 = ((Field) term101133).get((Object) null);
        term23599 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term23600 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term23654 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23655 = (byte[]) newByteArray(16);
        Object term23674 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23675 = (byte[]) newByteArray(16);
        Object term23694 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term23695 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23696 = (byte[]) newByteArray(16);
        Object term23715 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23716 = (byte[]) newByteArray(16);
        Object term23735 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23736 = (byte[]) newByteArray(16);
        Object term23767 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term23768 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23769 = (byte[]) newByteArray(16);
        Object term23799 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term23837 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23600, term23600.getClass(), "input", "hoicvmsovO");
        setIntField(term23600, term23600.getClass(), "length", 1540719661);
        setIntField(term23600, term23600.getClass(), "pos", 1265463001);
        setIntField(term23600, term23600.getClass(), "mark", 335112684);
        setField(term23599, term23599.getClass(), "reader", term23600);
        setBooleanField(term23599, term23599.getClass(), "trackErrors", true);
        setField(term23599, term23599.getClass(), "errors", term23617);
        setField(term23599, term23599.getClass(), "state", enum411);
        setField(term23599, term23599.getClass(), "emitPending", null);
        setBooleanField(term23599, term23599.getClass(), "isEmitPending", true);
        setField(term23654, term23654.getClass(), "value", term23655);
        setByteField(term23654, term23654.getClass(), "coder", (byte) -71);
        setIntField(term23654, term23654.getClass(), "count", 1551099402);
        setField(term23599, term23599.getClass(), "charBuffer", term23654);
        setField(term23674, term23674.getClass(), "value", term23675);
        setByteField(term23674, term23674.getClass(), "coder", (byte) 49);
        setIntField(term23674, term23674.getClass(), "count", -2027534003);
        setField(term23599, term23599.getClass(), "dataBuffer", term23674);
        setField(term23599, term23599.getClass(), "tagPending", null);
        setField(term23695, term23695.getClass(), "value", term23696);
        setByteField(term23695, term23695.getClass(), "coder", (byte) 0);
        setIntField(term23695, term23695.getClass(), "count", 0);
        setField(term23694, term23694.getClass(), "name", term23695);
        setField(term23715, term23715.getClass(), "value", term23716);
        setByteField(term23715, term23715.getClass(), "coder", (byte) 0);
        setIntField(term23715, term23715.getClass(), "count", 0);
        setField(term23694, term23694.getClass(), "publicIdentifier", term23715);
        setField(term23735, term23735.getClass(), "value", term23736);
        setByteField(term23735, term23735.getClass(), "coder", (byte) 0);
        setIntField(term23735, term23735.getClass(), "count", 0);
        setField(term23694, term23694.getClass(), "systemIdentifier", term23735);
        setBooleanField(term23694, term23694.getClass(), "forceQuirks", true);
        setField(term23694, term23694.getClass(), "type", enum412);
        setField(term23599, term23599.getClass(), "doctypePending", term23694);
        setField(term23768, term23768.getClass(), "value", term23769);
        setByteField(term23768, term23768.getClass(), "coder", (byte) 0);
        setIntField(term23768, term23768.getClass(), "count", 0);
        setField(term23767, term23767.getClass(), "data", term23768);
        setField(term23767, term23767.getClass(), "type", enum413);
        setField(term23599, term23599.getClass(), "commentPending", term23767);
        setField(term23799, term23799.getClass(), "tagName", "eqJfYWRaEL");
        setField(term23799, term23799.getClass(), "pendingAttributeName", "fhkbdRViHi");
        setField(term23799, term23799.getClass(), "pendingAttributeValue", "uWHnvSvaPl");
        setBooleanField(term23799, term23799.getClass(), "selfClosing", false);
        setField(term23837, term23837.getClass(), "attributes", null);
        setField(term23799, term23799.getClass(), "attributes", term23837);
        setField(term23799, term23799.getClass(), "type", enum414);
        setField(term23599, term23599.getClass(), "lastStartTag", term23799);
        setBooleanField(term23599, term23599.getClass(), "selfClosingFlagAcknowledged", false);
        term23851 = new Character('t');
        term23853 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23851;
        args[1] = term23853;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term23599, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


