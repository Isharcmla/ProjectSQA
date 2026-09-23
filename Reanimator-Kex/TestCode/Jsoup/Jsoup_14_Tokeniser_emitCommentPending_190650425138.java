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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_emitCommentPending_190650425138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33219;

    public Tokeniser_emitCommentPending_190650425138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114658 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term114657 = ((Class) term114658).getDeclaredField((String) "BeforeDoctypeSystemIdentifier");
        ((Field) term114657).setAccessible(true);
        Object enum472 = ((Field) term114657).get((Object) null);
        Class<? extends Object> term114907 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term114906 = ((Class) term114907).getDeclaredField((String) "ForeignContent");
        ((Field) term114906).setAccessible(true);
        Object enum473 = ((Field) term114906).get((Object) null);
        Object term33239 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term33239, term33239.getClass(), "errorMsg", "");
        setIntField(term33239, term33239.getClass(), "pos", -615654495);
        setCharField(term33239, term33239.getClass(), "c", 'n');
        setField(term33239, term33239.getClass(), "tokeniserState", enum472);
        setField(term33239, term33239.getClass(), "treeBuilderState", enum473);
        setField(term33239, term33239.getClass(), "token", null);
        Class<? extends Object> term115121 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term115120 = ((Class) term115121).getDeclaredField((String) "RawtextEndTagOpen");
        ((Field) term115120).setAccessible(true);
        Object enum474 = ((Field) term115120).get((Object) null);
        Class<? extends Object> term115334 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term115333 = ((Class) term115334).getDeclaredField((String) "InHeadNoscript");
        ((Field) term115333).setAccessible(true);
        Object enum475 = ((Field) term115333).get((Object) null);
        Object term33247 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term33247, term33247.getClass(), "errorMsg", "");
        setIntField(term33247, term33247.getClass(), "pos", -1476117762);
        setCharField(term33247, term33247.getClass(), "c", 'W');
        setField(term33247, term33247.getClass(), "tokeniserState", enum474);
        setField(term33247, term33247.getClass(), "treeBuilderState", enum475);
        setField(term33247, term33247.getClass(), "token", null);
        ArrayList term33237 = new ArrayList();
        ((ArrayList) term33237).add(term33239);
        ((ArrayList) term33237).add(term33247);
        Class<? extends Object> term115548 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term115547 = ((Class) term115548).getDeclaredField((String) "AfterDoctypeSystemIdentifier");
        ((Field) term115547).setAccessible(true);
        Object enum476 = ((Field) term115547).get((Object) null);
        Class<? extends Object> term115874 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term115873 = ((Class) term115874).getDeclaredField((String) "Doctype");
        ((Field) term115873).setAccessible(true);
        Object enum477 = ((Field) term115873).get((Object) null);
        Class<? extends Object> term116078 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term116077 = ((Class) term116078).getDeclaredField((String) "Comment");
        ((Field) term116077).setAccessible(true);
        Object enum478 = ((Field) term116077).get((Object) null);
        Class<? extends Object> term116367 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term116366 = ((Class) term116367).getDeclaredField((String) "StartTag");
        ((Field) term116366).setAccessible(true);
        Object enum479 = ((Field) term116366).get((Object) null);
        term33219 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term33220 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term33290 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term33291 = (byte[]) newByteArray(16);
        Object term33310 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term33311 = (byte[]) newByteArray(16);
        Object term33330 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term33331 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term33332 = (byte[]) newByteArray(16);
        Object term33351 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term33352 = (byte[]) newByteArray(16);
        Object term33371 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term33372 = (byte[]) newByteArray(16);
        Object term33403 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term33404 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term33405 = (byte[]) newByteArray(16);
        Object term33435 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term33473 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term33220, term33220.getClass(), "input", "TimdotUuNC");
        setIntField(term33220, term33220.getClass(), "length", -1210583429);
        setIntField(term33220, term33220.getClass(), "pos", -663691365);
        setIntField(term33220, term33220.getClass(), "mark", 339854490);
        setField(term33219, term33219.getClass(), "reader", term33220);
        setBooleanField(term33219, term33219.getClass(), "trackErrors", false);
        setField(term33219, term33219.getClass(), "errors", term33237);
        setField(term33219, term33219.getClass(), "state", enum476);
        setField(term33219, term33219.getClass(), "emitPending", null);
        setBooleanField(term33219, term33219.getClass(), "isEmitPending", true);
        setField(term33290, term33290.getClass(), "value", term33291);
        setByteField(term33290, term33290.getClass(), "coder", (byte) 121);
        setIntField(term33290, term33290.getClass(), "count", -341962980);
        setField(term33219, term33219.getClass(), "charBuffer", term33290);
        setField(term33310, term33310.getClass(), "value", term33311);
        setByteField(term33310, term33310.getClass(), "coder", (byte) -99);
        setIntField(term33310, term33310.getClass(), "count", 1532716628);
        setField(term33219, term33219.getClass(), "dataBuffer", term33310);
        setField(term33219, term33219.getClass(), "tagPending", null);
        setField(term33331, term33331.getClass(), "value", term33332);
        setByteField(term33331, term33331.getClass(), "coder", (byte) 0);
        setIntField(term33331, term33331.getClass(), "count", 0);
        setField(term33330, term33330.getClass(), "name", term33331);
        setField(term33351, term33351.getClass(), "value", term33352);
        setByteField(term33351, term33351.getClass(), "coder", (byte) 0);
        setIntField(term33351, term33351.getClass(), "count", 0);
        setField(term33330, term33330.getClass(), "publicIdentifier", term33351);
        setField(term33371, term33371.getClass(), "value", term33372);
        setByteField(term33371, term33371.getClass(), "coder", (byte) 0);
        setIntField(term33371, term33371.getClass(), "count", 0);
        setField(term33330, term33330.getClass(), "systemIdentifier", term33371);
        setBooleanField(term33330, term33330.getClass(), "forceQuirks", false);
        setField(term33330, term33330.getClass(), "type", enum477);
        setField(term33219, term33219.getClass(), "doctypePending", term33330);
        setField(term33404, term33404.getClass(), "value", term33405);
        setByteField(term33404, term33404.getClass(), "coder", (byte) 0);
        setIntField(term33404, term33404.getClass(), "count", 0);
        setField(term33403, term33403.getClass(), "data", term33404);
        setField(term33403, term33403.getClass(), "type", enum478);
        setField(term33219, term33219.getClass(), "commentPending", term33403);
        setField(term33435, term33435.getClass(), "tagName", "swZVeJAxjt");
        setField(term33435, term33435.getClass(), "pendingAttributeName", "xOcJIiQQDu");
        setField(term33435, term33435.getClass(), "pendingAttributeValue", "GVizqqzXpy");
        setBooleanField(term33435, term33435.getClass(), "selfClosing", false);
        setField(term33473, term33473.getClass(), "attributes", null);
        setField(term33435, term33435.getClass(), "attributes", term33473);
        setField(term33435, term33435.getClass(), "type", enum479);
        setField(term33219, term33219.getClass(), "lastStartTag", term33435);
        setBooleanField(term33219, term33219.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "emitCommentPending", argTypes, term33219, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


