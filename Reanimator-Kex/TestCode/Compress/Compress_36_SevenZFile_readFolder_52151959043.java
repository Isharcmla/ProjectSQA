package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class SevenZFile_readFolder_52151959043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8192;

    public SevenZFile_readFolder_52151959043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8209 = new ArrayList();
        ((ArrayList) term8209).add((Object)null);
        ((ArrayList) term8209).add((Object)null);
        ((ArrayList) term8209).add((Object)null);
        ((ArrayList) term8209).add((Object)null);
        ((ArrayList) term8209).add((Object)null);
        ((ArrayList) term8209).add((Object)null);
        ((ArrayList) term8209).add((Object)null);
        ArrayList term8336 = new ArrayList();
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        ((ArrayList) term8336).add((Object)null);
        term8192 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile"));
        Object term8205 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term8206 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term8228 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term8230 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Archive"));
        long[] term8232 = (long[]) newLongArray(0);
        Object term8233 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8234 = (long[]) newLongArray(1);
        long[] term8238 = (long[]) newLongArray(9);
        Object[] term8248 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Folder", 2);
        Object term8249 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        Object[] term8250 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coder", 0);
        Object[] term8253 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.BindPair", 5);
        long[] term8254 = (long[]) newLongArray(5);
        long[] term8260 = (long[]) newLongArray(4);
        Object term8268 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Folder"));
        Object[] term8269 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.Coder", 1);
        Object[] term8272 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.BindPair", 8);
        long[] term8273 = (long[]) newLongArray(2);
        long[] term8276 = (long[]) newLongArray(7);
        Object term8287 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SubStreamsInfo"));
        long[] term8288 = (long[]) newLongArray(1);
        Object term8290 = newInstance(Class.forName("java.util.BitSet"));
        long[] term8291 = (long[]) newLongArray(1);
        long[] term8295 = (long[]) newLongArray(9);
        Object[] term8305 = (Object[]) newArray("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", 0);
        Object term8306 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.StreamMap"));
        int[] term8307 = (int[]) newIntArray(4);
        long[] term8312 = (long[]) newLongArray(5);
        int[] term8318 = (int[]) newIntArray(9);
        int[] term8328 = (int[]) newIntArray(2);
        byte[] term8333 = (byte[]) newByteArray(2);
        setField(term8192, term8192.getClass(), "fileName", "eVpkWxjuki");
        setIntField(term8206, term8206.getClass(), "fd", -1);
        setLongField(term8206, term8206.getClass(), "handle", -1L);
        setField(term8206, term8206.getClass(), "parent", null);
        setField(term8206, term8206.getClass(), "otherParents", term8209);
        setBooleanField(term8206, term8206.getClass(), "closed", true);
        setBooleanField(term8206, term8206.getClass(), "append", false);
        setField(term8206, term8206.getClass(), "cleanup", null);
        setField(term8205, term8205.getClass(), "fd", term8206);
        setField(term8205, term8205.getClass(), "channel", null);
        setBooleanField(term8205, term8205.getClass(), "rw", true);
        setField(term8205, term8205.getClass(), "path", "SJiQaLvSKv");
        setIntField(term8228, term8228.getClass(), "value", -434468428);
        setField(term8205, term8205.getClass(), "closed", term8228);
        setField(term8192, term8192.getClass(), "file", term8205);
        setLongField(term8230, term8230.getClass(), "packPos", -5221172945585313119L);
        setField(term8230, term8230.getClass(), "packSizes", term8232);
        setField(term8233, term8233.getClass(), "words", term8234);
        setIntField(term8233, term8233.getClass(), "wordsInUse", 1559605714);
        setBooleanField(term8233, term8233.getClass(), "sizeIsSticky", false);
        setField(term8230, term8230.getClass(), "packCrcsDefined", term8233);
        setLongElement(term8238, 0, -4331547344847792516L);
        setLongElement(term8238, 1, -677383924825139585L);
        setLongElement(term8238, 2, 3676304089995045597L);
        setLongElement(term8238, 3, 9176995849424666996L);
        setLongElement(term8238, 4, -3212680229932754821L);
        setLongElement(term8238, 5, -8974514191774285441L);
        setLongElement(term8238, 6, -4546853968080919834L);
        setLongElement(term8238, 7, 1281872419462997592L);
        setLongElement(term8238, 8, -700098407024972610L);
        setField(term8230, term8230.getClass(), "packCrcs", term8238);
        setField(term8249, term8249.getClass(), "coders", term8250);
        setLongField(term8249, term8249.getClass(), "totalInputStreams", 8346130120381478068L);
        setLongField(term8249, term8249.getClass(), "totalOutputStreams", -2325777595445399907L);
        setField(term8249, term8249.getClass(), "bindPairs", term8253);
        setLongElement(term8254, 0, 547751867620565142L);
        setLongElement(term8254, 1, 7129464628272755377L);
        setLongElement(term8254, 2, -1473630530222186168L);
        setLongElement(term8254, 3, -491562959649300308L);
        setLongElement(term8254, 4, -348524442664216841L);
        setField(term8249, term8249.getClass(), "packedStreams", term8254);
        setLongElement(term8260, 0, 7543403646493723501L);
        setLongElement(term8260, 1, -6800678833488490645L);
        setLongElement(term8260, 2, -4582297078014649720L);
        setLongElement(term8260, 3, 4071050160240086990L);
        setField(term8249, term8249.getClass(), "unpackSizes", term8260);
        setBooleanField(term8249, term8249.getClass(), "hasCrc", false);
        setLongField(term8249, term8249.getClass(), "crc", 6279284197715302448L);
        setIntField(term8249, term8249.getClass(), "numUnpackSubStreams", 1146601902);
        setElement(term8248, 0, term8249);
        setField(term8268, term8268.getClass(), "coders", term8269);
        setLongField(term8268, term8268.getClass(), "totalInputStreams", 8032688624254626392L);
        setLongField(term8268, term8268.getClass(), "totalOutputStreams", -6760944154924277473L);
        setField(term8268, term8268.getClass(), "bindPairs", term8272);
        setLongElement(term8273, 0, -7377577718146705627L);
        setLongElement(term8273, 1, -4742652737531811018L);
        setField(term8268, term8268.getClass(), "packedStreams", term8273);
        setLongElement(term8276, 0, 7714939142473649868L);
        setLongElement(term8276, 1, -1207137470414072121L);
        setLongElement(term8276, 2, -3430555142569753657L);
        setLongElement(term8276, 3, -5740116915366900340L);
        setLongElement(term8276, 4, 4535342579444446360L);
        setLongElement(term8276, 5, -1616865027789487667L);
        setLongElement(term8276, 6, 2204129642286303189L);
        setField(term8268, term8268.getClass(), "unpackSizes", term8276);
        setBooleanField(term8268, term8268.getClass(), "hasCrc", false);
        setLongField(term8268, term8268.getClass(), "crc", -7650346959035604834L);
        setIntField(term8268, term8268.getClass(), "numUnpackSubStreams", -1938881385);
        setElement(term8248, 1, term8268);
        setField(term8230, term8230.getClass(), "folders", term8248);
        setLongElement(term8288, 0, 8872844183222227244L);
        setField(term8287, term8287.getClass(), "unpackSizes", term8288);
        setField(term8290, term8290.getClass(), "words", term8291);
        setIntField(term8290, term8290.getClass(), "wordsInUse", -1629418973);
        setBooleanField(term8290, term8290.getClass(), "sizeIsSticky", true);
        setField(term8287, term8287.getClass(), "hasCrc", term8290);
        setLongElement(term8295, 0, 870803540234717320L);
        setLongElement(term8295, 1, -5928376730962730330L);
        setLongElement(term8295, 2, 3459456097754089065L);
        setLongElement(term8295, 3, -2286727398190518737L);
        setLongElement(term8295, 4, 7624135425106525336L);
        setLongElement(term8295, 5, -1462575889150559403L);
        setLongElement(term8295, 6, -5162356149587830708L);
        setLongElement(term8295, 7, -6151803779994618544L);
        setLongElement(term8295, 8, -3845020763922073283L);
        setField(term8287, term8287.getClass(), "crcs", term8295);
        setField(term8230, term8230.getClass(), "subStreamsInfo", term8287);
        setField(term8230, term8230.getClass(), "files", term8305);
        setIntElement(term8307, 0, -100825168);
        setIntElement(term8307, 1, 768407648);
        setIntElement(term8307, 2, -350454594);
        setIntElement(term8307, 3, -1148142995);
        setField(term8306, term8306.getClass(), "folderFirstPackStreamIndex", term8307);
        setLongElement(term8312, 0, -1090914825205410494L);
        setLongElement(term8312, 1, -886880864570970229L);
        setLongElement(term8312, 2, -8630203052292608833L);
        setLongElement(term8312, 3, 6568177377240200159L);
        setLongElement(term8312, 4, -4079309837554264946L);
        setField(term8306, term8306.getClass(), "packStreamOffsets", term8312);
        setIntElement(term8318, 0, -233024044);
        setIntElement(term8318, 1, 1820784228);
        setIntElement(term8318, 2, 1390820006);
        setIntElement(term8318, 3, -828982065);
        setIntElement(term8318, 4, 1221443226);
        setIntElement(term8318, 5, 908108726);
        setIntElement(term8318, 6, 1023209512);
        setIntElement(term8318, 7, 1084849225);
        setIntElement(term8318, 8, -1702055571);
        setField(term8306, term8306.getClass(), "folderFirstFileIndex", term8318);
        setIntElement(term8328, 0, -944542900);
        setIntElement(term8328, 1, 2063762142);
        setField(term8306, term8306.getClass(), "fileFolderIndex", term8328);
        setField(term8230, term8230.getClass(), "streamMap", term8306);
        setField(term8192, term8192.getClass(), "archive", term8230);
        setIntField(term8192, term8192.getClass(), "currentEntryIndex", 1658391716);
        setIntField(term8192, term8192.getClass(), "currentFolderIndex", 2143282300);
        setField(term8192, term8192.getClass(), "currentFolderInputStream", null);
        setByteElement(term8333, 0, (byte) -31);
        setByteElement(term8333, 1, (byte) 21);
        setField(term8192, term8192.getClass(), "password", term8333);
        setField(term8192, term8192.getClass(), "deferredBlockStreams", term8336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readFolder", argTypes, term8192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


