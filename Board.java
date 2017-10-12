public class Board
{
    private Board_STATUS _BoardStatus;
    public event EventHandler BoardStatusChanged;


    public Board_STATUS BoardStatus
    {
        get
        {
            return _BoardStatus;
        }
        set
        {
            if (value != _BoardStatus)
            {
                _BoardStatus = value;
                OnBoardStatusChanged();
            }
        }